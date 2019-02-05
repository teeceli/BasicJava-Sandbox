package com.sandbox.sandbox;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sandbox.sandbox.OptionalSandbox;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class OptionalSandboxTest {
	
	private static final List<String> NAMES = Arrays.asList("Larry", "Moe", "Curly", "Timur", "Leah", "Chico");

	private static final int NAME_LIST_SIZE = 6;
	
	@Autowired
	private OptionalSandbox optionalSandbox;
	
	@Test
	public void testOptional() {
		
		final int listSize = optionalSandbox.getListSize(NAMES);
		
		assertEquals(NAME_LIST_SIZE, listSize);
	}
}