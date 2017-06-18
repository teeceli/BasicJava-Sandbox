package arrowhead;

import java.util.Objects;

public class Candidate {
	
	private String firstName;
	
	private String lastName;
	
	private String emailAddress;
	
	private Integer age;
	
	private String state;
	
	private GradePointAverage gpa;
	
	private TestScores testScores;
	
	private Felony felony;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(final String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(final Integer age) {
		this.age = age;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(final String state) {
		this.state = state;
	}
	
	public GradePointAverage getGpa() {
		return gpa;
	}
	
	public void setGpa(final GradePointAverage gpa) {
		this.gpa = gpa;
	}
	
	public TestScores getTestScores() {
		return testScores;
	}
	
	public void setTestScores(final TestScores testScores) {
		this.testScores = testScores;
	}
	
	public Felony getFelony() {
		return felony;
	}
	
	public void setFelony(final Felony felony) {
		this.felony = felony;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, emailAddress, age, state, gpa, testScores, felony);
	}
	
	@Override
	public boolean equals(Object o) {

		if (o == this) return true;
		if (!(o instanceof Candidate)) {
			return false;
		}
	
		Candidate candidate = (Candidate) o;
		return age == candidate.age &&
				Objects.equals(firstName, candidate.firstName) &&
				Objects.equals(lastName, candidate.lastName) &&
				Objects.equals(emailAddress, candidate.emailAddress) &&
				Objects.equals(state, candidate.state) &&
				Objects.equals(gpa, candidate.gpa) &&
				Objects.equals(testScores, candidate.testScores) &&
				Objects.equals(felony, candidate.felony);
	}	

	@Override
	public String toString() {
		return "Candidate [firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress
				+ ", age=" + age + ", state=" + state + ", gpa=" + gpa + ", testScores=" + testScores + ", felony="
				+ felony + "]";
	}
}