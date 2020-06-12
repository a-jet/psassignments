package com.sapient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {
	List<EmployeePOJO> e = new ArrayList<>();

	public EmployeeDAO() {
		super();
		e.add(new EmployeePOJO("101", "Teja"));
		e.add(new EmployeePOJO("102", "Ajet"));
	}

	public List<EmployeePOJO> getAll() {
		return e;
	}

	public EmployeePOJO getAny(String s) {
		for (EmployeePOJO emp : e) {
			if (emp.getId().equals(s) || emp.getName().equals(s)) {
				return emp;
			}
		}
		return null;
	}

	public List<EmployeePOJO> insert(EmployeePOJO emp) {
		e.add(emp);
		return e;
	}

	public List<EmployeePOJO> modify(EmployeePOJO emp) {
		for (EmployeePOJO empl : e) {
			if (empl.getId().equals(emp.getId())) {
				empl.setName(emp.getName());
			}
		}
		return e;
	}

	public List<EmployeePOJO> remove(EmployeePOJO emp) {
		e.remove(emp);
		return e;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e == null) ? 0 : e.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDAO other = (EmployeeDAO) obj;
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		return true;
	}
}
