package com.department.Department.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.department.Department.error.DepartentNotFondException;
import com.department.Department.pojo.Department;

public interface DepartmentServiceI {
	public Department saveDepartment(Department department);

	public List<Department> fatchDepartmentList();

	public Department findByDepartmentID(Long id) throws DepartentNotFondException;

	public void deleteByDepartmentID(Long id);

	public Department updateByDepartmentID(Long id, Department department);

	public Department findByDepartmentName(String departmentName);
	
	List<Department> findByDepartmentSort(String title, Sort sort);

}
