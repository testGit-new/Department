package com.department.Department;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.department.Department.pojo.Department;
import com.department.Department.repository.DepartmentRepository;
import com.department.Department.service.DepartmentServiceI;

//@SpringBootTest
public class DepartmentServiceImplTest {
	
	/*
	 * @Autowired private DepartmentServiceI servic;
	 * 
	 * @MockBean private DepartmentRepository repo;
	 * 
	 * @BeforeEach() void setUp() { Department dp =
	 * Department.builder().departmentName("IT") .departmentAddress("Delhi")
	 * .departmentCode("E0-09"). departmentId(1L).build();
	 * Mockito.when(repo.findByDepartmentName("IT")).thenReturn(dp); }
	 * 
	 * @Test public void whenValidDepartmentname_thenDepartmentnotFond() { String
	 * departname= "IT"; Department dept = servic.findByDepartmentName(departname);
	 * 
	 * assertEquals(departname, dept.getDepartmentName());
	 * 
	 * }
	 * 
	 */
}
