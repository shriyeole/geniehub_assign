package com.example.mongoexample;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.tomcat.util.digester.ArrayStack;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.mongoexample.controllers.stucontrollerimpl;
import com.example.mongoexample.models.students;
import com.example.mongoexample.repository.StudentRepository;

@SpringBootTest
class MongoexampleApplicationTests {

	@Mock
	private StudentRepository studentRepository;

	@InjectMocks
	private stucontrollerimpl stucontrollerimpl;

	@Test
	public void getstudtest() {
		List<students> mockStudents = Stream.of(new students("1", "shri", "mumbai", "spit", 11110),
				new students("2", "rushi", "pune", "spit", 50000)).collect(Collectors.toList());

		when(studentRepository.findAll()).thenReturn(mockStudents);
		System.out.println("Mock Students: " + mockStudents);

		ResponseEntity<?> responseEntity = stucontrollerimpl.getStud();

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
		assertEquals(mockStudents, responseEntity.getBody());
	}
	
	@Test
	public void testAddStud() {
        
        students mockStudent = new students("1", "shri", "mumbai", "spit", 11110);

        when(studentRepository.save(mockStudent)).thenReturn(mockStudent);

        
        ResponseEntity<?> responseEntity = stucontrollerimpl.addStud(mockStudent);

        
        verify(studentRepository).save(mockStudent); 
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertEquals("Student added successfully", responseEntity.getBody());
	}
}
