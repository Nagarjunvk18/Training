package com.studentmng.dao;

import org.junit.Test;

import com.studentmng.model.Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

public class StudentDaoTest {
	@Test
	public void testGetAllStudents() {
		StudentDao dao = new StudentDaoImpl();
		List<Student> students = dao.getAllStudents();
		assertEquals(2, students.size());
	}

	@Test
	public void testGetStudent() {
		StudentDao dao = new StudentDaoImpl();
		Student student = dao.getStudent(0);
		assertEquals("Virat Kohli", student.getName());
	}

	@Test
	public void testUpdateStudent() {
		StudentDao dao = new StudentDaoImpl();
		Student student = dao.getStudent(0);
		student.setName("Raina");
		dao.updateStudent(student);
		assertEquals("Raina", dao.getStudent(0).getName());
	}

	@Test
	public void testAddStudent() {
		StudentDao dao = new StudentDaoImpl();
		Student student = new Student("Yuvaraj", 2);
		dao.addStudent(student);
		assertEquals(3, dao.getAllStudents().size());
	}

	@Test
	public void testDeleteStudent() {
		StudentDao dao = new StudentDaoImpl();
		dao.deleteStudent(0);
		assertNull(dao.getStudent(0));
	}
}
