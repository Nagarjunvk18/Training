package com.studentmng.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	private Student student;

	@Before
	public void setup() {
		student = new Student("Nag", 0);
	}

	@Test
	public void testGetName() {

		assertEquals("Nag", student.getName());
	}

	@Test
	public void testSetName() {

		student.setName("Arjun");
		assertEquals("Arjun", student.getName());
	}

	@Test
	public void testGetRollNo() {

		assertEquals(0, student.getRollNo());
	}

	@Test
	public void testSetRollNo() {

		student.setRollNo(1);
		assertEquals(1, student.getRollNo());
	}

	@Test
	public void testToString() {

		assertEquals("Student [name=Nag, rollNo=0]", student.toString());
	}
}
