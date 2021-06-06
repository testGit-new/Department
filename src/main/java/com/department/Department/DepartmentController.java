package com.department.Department;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.Department.error.DepartentNotFondException;
import com.department.Department.pojo.Department;
import com.department.Department.service.DepartmentServiceI;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DepartmentController {

	@Autowired
	private DepartmentServiceI service;

	private final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

	@PostMapping("/department")
	public Department saveDepartment(@Valid @RequestBody Department department) {

		logger.info("Inside saveDepartment Method of DepartmentController");
		return service.saveDepartment(department);

	}

	@GetMapping("/department")
	public List<Department> fatchDepartmentList() {

		return service.fatchDepartmentList();
	}

	@GetMapping("/department/{id}")
	public Department findByDepartmentID(@PathVariable("id") Long id) throws DepartentNotFondException {

		logger.info("Inside findByDepartmentID  Method of DepartmentController");
		return service.findByDepartmentID(id);
	}

	@GetMapping("/department/name/{name}")
	public Department findByDepartmentName(@PathVariable("name") String departmentName) {

		logger.info("Inside findByDepartmentName  Method of DepartmentController");

		return service.findByDepartmentName(departmentName);
	}

	@DeleteMapping("/department/{id}")
	public String deleteByDepartmentID(@PathVariable("id") Long id) {

		service.deleteByDepartmentID(id);

		logger.info("Inside deleteByDepartmentID  Method of DepartmentController");

		return "Department is deleted Successfully";
	}

	@PutMapping("/department/{id}")
	public Department updateByDepartmentID(@PathVariable("id") Long id, @RequestBody Department department) {

		return service.updateByDepartmentID(id, department);
	}

}
