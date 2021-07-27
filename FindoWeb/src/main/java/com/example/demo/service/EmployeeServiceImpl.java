package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
	
	@Autowired
	private EmployeeRepo employeeRepository;
	
	
	@Override
	public List<Employee>getAllEmployee() {
		// TODO Auto-generated method stub
		return  employeeRepository.findAll();
	}


	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;
	}


	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
		
	}
	
	}
	


