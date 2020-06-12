package com.sapient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeDAO emp;
	@GetMapping(value="/emp")
	public List<EmployeePOJO> f1(){
		return emp.getAll();
	}
	@GetMapping(value="/emp/{s}")
	public EmployeePOJO f2(@PathVariable String s){
		return emp.getAny(s);
	}
	@PostMapping(value="/emp")
	public List<EmployeePOJO> f3(@RequestBody EmployeePOJO empl){
		return emp.insert(empl);
	}
	@PostMapping(value="/emp/modify")
	public List<EmployeePOJO> f4(@RequestBody EmployeePOJO empl){
		return emp.modify(empl);
	}
	@PostMapping(value="/emp/delete")
	public List<EmployeePOJO> f5(@RequestBody EmployeePOJO empl){
		return emp.remove(empl);
	}
}
