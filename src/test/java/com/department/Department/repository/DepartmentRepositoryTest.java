package com.department.Department.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.department.Department.pojo.Department;

//@DataJpaTest
public class DepartmentRepositoryTest {
	/*
	 * @Autowired private DepartmentRepository repo;
	 * 
	 * @Autowired private TestEntityManager entityManager;
	 * 
	 * @BeforeEach void setUp() {
	 * 
	 * Department department = Department.builder().departmentName("IT").
	 * departmentAddress("Delhi") .departmentCode("E0-01").build();
	 * entityManager.persist(department); }
	 * 
	 * @Test public void whenFindbyID_thenReturnDepartmentName() {
	 * 
	 * Department department = repo.findById(1L).get();
	 * assertEquals(department.getDepartmentName(), "IT");
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 */}
