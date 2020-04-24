package com.sapient.otherexamples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KeyReadLine2 {
	int[] data;
	boolean present=false;
	public void read() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=s.nextInt();
		data=new int[n];
		present=true;
		System.out.println("Enter data: ");
		for(int i=0;i<n;i++) {
			data[i]=s.nextInt();
		}
	}

	public void display() {
		// TODO Auto-generated method stub
		if(!present) {
			System.out.println("No Data ");
			return;
		}
		System.out.println("Displaying the data :");
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}

	public void sort() {
		// TODO Auto-generated method stub
		if(!present) {
			System.out.println("No Data ");
			return;
		}
		Arrays.sort(data);
		System.out.println("Sorting the data :");
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}

	public void find(int x) {
		// TODO Auto-generated method stub
		if(!present) {
			System.out.println("No Data ");
			return;
		}
		for(int i=0;i<data.length;i++) {
			if(x==data[i]) {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not Found");
	}

}
