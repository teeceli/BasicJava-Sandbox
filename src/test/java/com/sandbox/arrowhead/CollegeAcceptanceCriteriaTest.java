package com.sandbox.arrowhead;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sandbox.arrowhead.Candidate;
import com.sandbox.arrowhead.CollegeAcceptanceCriteria;
import com.sandbox.arrowhead.Decision;
import com.sandbox.arrowhead.Felony;
import com.sandbox.arrowhead.GradePointAverage;
import com.sandbox.arrowhead.TestScores;

public class CollegeAcceptanceCriteriaTest {
	
	private GradePointAverage gpa = new GradePointAverage();
	private TestScores testScores = new TestScores();
	private Felony felony = new Felony();
	private Candidate candidate = new Candidate();
	
	@Before
	public void setUp() {
		
		setUpGradePointAverage(gpa, 4.0f, 5.0f);
		setUpTestScores(testScores, 1200, 25);
		setUpFelony(felony, true, 6);
		setUpCandidate(candidate, "John", "Doe", "john.doe@mail.com", 30, "CA", gpa, testScores, felony);
	}
	
	@Test
	public void testCandidateNeedsFurtherReview() {
		
		Decision decisionExpected = new Decision();
		decisionExpected.setResult("further review");
		
		Decision decisionActual = CollegeAcceptanceCriteria.checkCandidateAccepted(candidate);
		
		assertEquals(decisionExpected, decisionActual);
	}

	@Test
	public void testCandidateInstantAcceptAgeState() {
		
		candidate.setAge(18);
		
		Decision decisionExpected = new Decision();
		decisionExpected.setResult("instant accept");
		decisionExpected.setMessage("good age");
		
		Decision decisionActual = CollegeAcceptanceCriteria.checkCandidateAccepted(candidate);
		
		assertEquals(decisionExpected, decisionActual);
	}

	@Test
	public void testCandidateInstantAcceptHighGPA() {
		
		candidate.getGpa().setScore(4.8f);
		
		Decision decisionExpected = new Decision();
		decisionExpected.setResult("instant accept");
		decisionExpected.setMessage("high GPA score");
		
		Decision decisionActual = CollegeAcceptanceCriteria.checkCandidateAccepted(candidate);
		
		assertEquals(decisionExpected, decisionActual);
	}

	@Test
	public void testCandidateInstantAcceptHighTestScore() {
		
		candidate.getTestScores().setSatScore(1950);
		
		Decision decisionExpected = new Decision();
		decisionExpected.setResult("instant accept");
		decisionExpected.setMessage("high test score");
		
		Decision decisionActual = CollegeAcceptanceCriteria.checkCandidateAccepted(candidate);
		
		assertEquals(decisionExpected, decisionActual);
	}

	@Test
	public void testCandidateInstantRejectEmptyFields() {
		
		candidate.getGpa().setScore(null);
		
		Decision decisionExpected = new Decision();
		decisionExpected.setResult("instant reject");
		decisionExpected.setMessage("Not all fields captured");
		
		Decision decisionActual = CollegeAcceptanceCriteria.checkCandidateAccepted(candidate);
		
		assertEquals(decisionExpected, decisionActual);
	}

	@Test
	public void testCandidateInstantRejectFelony() {
		
		candidate.getFelony().setYearsSinceFelony(5);
		
		Decision decisionExpected = new Decision();
		decisionExpected.setResult("instant reject");
		decisionExpected.setMessage("felony too recent");
		
		Decision decisionActual = CollegeAcceptanceCriteria.checkCandidateAccepted(candidate);
		
		assertEquals(decisionExpected, decisionActual);
	}

	@Test
	public void testCandidateInstantRejectLowGPA() {
		
		candidate.getGpa().setScore(2.0f);
		
		Decision decisionExpected = new Decision();
		decisionExpected.setResult("instant reject");
		decisionExpected.setMessage("gpa too low");
		
		Decision decisionActual = CollegeAcceptanceCriteria.checkCandidateAccepted(candidate);
		
		assertEquals(decisionExpected, decisionActual);
	}

	@Test
	public void testCandidateInstantRejectInvalidAge() {
		
		candidate.setAge(-20);
		
		Decision decisionExpected = new Decision();
		decisionExpected.setResult("instant reject");
		decisionExpected.setMessage("invalid age");
		
		Decision decisionActual = CollegeAcceptanceCriteria.checkCandidateAccepted(candidate);
		
		assertEquals(decisionExpected, decisionActual);
	}

	@Test
	public void testCandidateInstantRejectInvalidNameFormat() {
		
		candidate.setFirstName("john");
		
		Decision decisionExpected = new Decision();
		decisionExpected.setResult("instant reject");
		decisionExpected.setMessage("invalid name format");
		
		Decision decisionActual = CollegeAcceptanceCriteria.checkCandidateAccepted(candidate);
		
		assertEquals(decisionExpected, decisionActual);
	}
	
	private void setUpGradePointAverage(final GradePointAverage gpa, final Float score, final Float scale) {
		
		gpa.setScale(scale);
		gpa.setScore(score);
	}
	
	private void setUpTestScores(final TestScores testScores, final Integer satScore, final Integer actScore) {
		
		testScores.setSatScore(satScore);
		testScores.setActScore(actScore);		
	}

	private void setUpFelony(final Felony felony, final Boolean hasFelony, final Integer yearsSinceFelony) {
		
		felony.setHasFelony(hasFelony);
		felony.setYearsSinceFelony(yearsSinceFelony);
	}

	private void setUpCandidate(final Candidate candidate, final String firstName, final String lastName, 
			final String emailAddress, final Integer age, final String state, 
			final GradePointAverage gpa, final TestScores testScores, final Felony felony) {
		
		candidate.setFirstName(firstName);
		candidate.setLastName(lastName);
		candidate.setEmailAddress(emailAddress);
		candidate.setAge(age);
		candidate.setState(state);	
		candidate.setGpa(gpa);
		candidate.setTestScores(testScores);
		candidate.setFelony(felony);
	}
}