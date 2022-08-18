package com.emp.service;

import java.util.List;

import com.emp.entity.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	
	
	//Dummy Employee list 
	
	List<Employee> list = List.of(
			new Employee(1311L,"Peter PArker","4578712547"),
			new Employee(1312L,"Tony","457874547"),
			new Employee(1313L,"Robert","455646147"),
			new Employee(1314L,"Chris","457826486"),
			new Employee(1315L,"Sam","4578715453"),
			new Employee(1316L,"William","451566843"),
			new Employee(1317L,"Max","4578751658"),
			new Employee(1318L,"Lucy","457815687"),
			new Employee(1319L,"Sofia","45785135637")
			
			);

	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(employee -> employee.geteId().equals(id)).findAny().orElse(null);
	}

}
