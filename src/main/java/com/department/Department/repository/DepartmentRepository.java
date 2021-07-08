package com.department.Department.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.department.Department.pojo.Department;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Long>{
	
	public Department findByDepartmentName(String departmentName);
	
	/* List<Department> findByDepartmentSort(String title, Sort sort); */


}
