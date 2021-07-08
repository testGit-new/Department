package com.department.Department.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.department.Department.error.DepartentNotFondException;
import com.department.Department.pojo.Department;
import com.department.Department.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentServiceI{
	
	@Autowired
	DepartmentRepository repo;

	@Override
	public Department saveDepartment(Department department) {
		
		return repo.save(department);
	}

	@Override
	public List<Department> fatchDepartmentList() {
		
		return repo.findAll();
	}

	@Override
	public Department findByDepartmentID(Long id) throws DepartentNotFondException  {
		Optional<Department> department =  repo.findById(id);
		
		if(!department.isPresent()) {
			throw new DepartentNotFondException("Department Not Fond.");
			
		}
		return department.get();
	}

	@Override
	public void deleteByDepartmentID(Long id) {
		 repo.deleteById(id);;
	}

	@Override
	public Department updateByDepartmentID(Long id, Department department) {
		Department dep =repo.findById(id).get();
		
		if(Objects.nonNull(dep.getDepartmentName()) &&
				!"".equals(dep.getDepartmentName())) {
						dep.setDepartmentName(department.getDepartmentName());
						
		}
		if(Objects.nonNull(dep.getDepartmentAddress()) &&
				!"".equals(dep.getDepartmentAddress())) {
						dep.setDepartmentAddress(department.getDepartmentAddress());
						
		}
		if(Objects.nonNull(dep.getDepartmentCode()) &&
				!"".equals(dep.getDepartmentCode())) {
						dep.setDepartmentCode(department.getDepartmentCode());
						
		}
		
		return repo.save(dep);
	}

	@Override
	public Department findByDepartmentName(String departmentName) {
		return repo.findByDepartmentName(departmentName);
	}

	/*
	 * @Override public List<Department> findByDepartmentSort(String title, Sort
	 * sort) { return repo.findByDepartmentSort(title, sort); }
	 */
	
	
	
	

}
