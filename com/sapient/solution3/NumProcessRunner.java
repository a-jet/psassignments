package com.sapient.solution3;


public class NumProcessRunner{

	public static void main(String[] args) {
		System.out.println("Enter the two numbers: ");
		int a=Read.br.nextInt();
		int b=Read.br.nextInt();
		System.out.println("Enter");
		System.out.println("  A or a for Addition");
		System.out.println("  S or s for Subtraction");
		System.out.println("  M or m for Multiplication");
		System.out.println("  D or d for Division");
		String s=Read.br.next();
		Calculate c=Calculate.valueOf(s.toUpperCase());
		System.out.println(c.cal(a, b));
	}

}