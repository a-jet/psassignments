package com.sapient;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
	public static boolean check(int n){
		if(n%2==0) return true;
		return false;
	}
	public static void main(String[] args){
		System.out.println("Hello, Please enter an integer!");
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		boolean t=check(p);
		if(t==true) System.out.println("That's an even number!");
		else System.out.println("That's an odd number!");
	}
}
