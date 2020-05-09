package com.sapient.StudentSolution;

public class MyException extends Exception {
	String id;
	public MyException(String id) {
		this.id=id;
	}
	public String toString() {
		return id+" not found";
	}
}
