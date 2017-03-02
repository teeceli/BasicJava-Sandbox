package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import interview.InterviewObjectEquals;
import interview.Interviewer;

public class InterviewObjectEqualsTest {
	
	private final static String FIRST_NAME = "Timur";
	
	private final static String LAST_NAME = "Celikel";
	
	private final static Integer ID = 1;
	
	@Test
	public void testGetFullName() {
		
		Interviewer interviewer = new Interviewer();
		interviewer.setId(ID);
		interviewer.setFirstName(FIRST_NAME);
		interviewer.setLastName(LAST_NAME);
		
		String expected = "Timur Celikel";
	
		String actual = InterviewObjectEquals.getFullName(interviewer);
		
		assertEquals(expected, actual);
	}
}
