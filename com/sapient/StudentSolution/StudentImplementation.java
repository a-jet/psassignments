package com.sapient.StudentSolution;

import java.util.Arrays;

import com.sapient.FilesSolution.Read;

public class StudentImplementation {
	Student s[];
	public void readStudent() {
		System.out.print("How many students you want to read? ");
		int n=Read.br.nextInt();
		s=new Student[n];
		String name,id,city;
		for(int i=0;i<n;i++) {
			s[i]=new Student();
			System.out.print("Enter student "+(i+1)+" name: ");
			name=Read.br.next();
			s[i].setName(name);
			System.out.print("Enter student "+(i+1)+" id: ");
			id=Read.br.next();
			s[i].setId(id);
			System.out.print("Enter student "+(i+1)+" city: ");
			city=Read.br.next();
			s[i].setCity(city);
		}
		Arrays.sort(s,StudentImplementation::compareId);
	}
	public void displayStudent() {
		System.out.println("Displaying student details,");
		for(int i=0;i<s.length;i++) {
			System.out.print("Name: "+s[i].getName()+"\t");
			System.out.print("Id :"+s[i].getId()+"\t");
			System.out.println("City :"+s[i].getCity());
		}
	}
	public void displayStudentsOfCity(String city) {
		System.out.println("Students details of "+city);
		for(int i=0;i<s.length;i++) {
			if(s[i].getCity().equals(city)) {
				System.out.print("Name: "+s[i].getName()+"\t");
				System.out.println("Id :"+s[i].getId());
			}
		}
	}
	public void displaySortedNames() {
		Arrays.sort(s,StudentImplementation::compareName);
		System.out.println("Students sorted by names");
		for(int i=0;i<s.length;i++) {
			System.out.print("Name: "+s[i].getName()+"\t");
			System.out.print("Id :"+s[i].getId()+"\t");
			System.out.println("City :"+s[i].getCity());
		}
		Arrays.sort(s,StudentImplementation::compareId);
	}
	public void displaySortedCity() {
		Arrays.sort(s,StudentImplementation::comparecity);
		System.out.println("Students sorted by city");
		for(int i=0;i<s.length;i++) {
			System.out.print("Name: "+s[i].getName()+"\t");
			System.out.print("Id :"+s[i].getId()+"\t");
			System.out.println("City :"+s[i].getCity());
		}
		Arrays.sort(s,StudentImplementation::compareId);
	}
	public void displayStudentDetails(String id) {
		try {
			for(int i=0;i<s.length;i++) {
				if(s[i].getId().equals(id)) {
					System.out.println("Student details: ");
					System.out.print("Name: "+s[i].getName()+"\t");
					System.out.println("City :"+s[i].getCity());
					return;
				}
			}
			throw new MyException(id);
		}
		catch(MyException e) {
			System.out.println(e);
		}
	}
	
	
	public static int compareName(Student a,Student b) {
		return a.getName().compareTo(b.getName());
	}
	public static int comparecity(Student a,Student b) {
		return a.getCity().compareTo(b.getCity());
	}
	public static int compareId(Student a,Student b) {
		return a.getId().compareTo(b.getId());
	}
}
