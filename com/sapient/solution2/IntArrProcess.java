package com.sapient.solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.sapient.solution3.Read;

public class IntArrProcess {
	ArrayList<Integer> a;
	IntArrProcess(){
		a=new ArrayList<Integer>(10);
	}
	IntArrProcess(int x){
		a=new ArrayList<Integer>(x);
	}
	IntArrProcess(ArrayList<Integer> x){
		a=new ArrayList<Integer>(x);
	}
	IntArrProcess(IntArrProcess x){
		a=new ArrayList<Integer>(x.a);
	}
	void sum() {
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		System.out.println("Sum "+sum);
	}
	void min() {
		System.out.println("Minimum element: "+Collections.min(a));
		
	}
	void max() {
		System.out.println("Maximum element: "+Collections.max(a));
		
	}
	void sort() {
		Collections.sort(a);
		System.out.println("Array sorted");
		
	}
	void displayV() {
		System.out.println("Displaying the elements vertically:");
		for(int x:a) {
			System.out.println(x);
		}
		System.out.println();

		
	}
	void displayH() {
		System.out.println("Displaying the elemnts horizontally:");
		for(int x:a) {
			System.out.print(x);
			System.out.print(" ");
		}
		System.out.println();
	}
	void read() {
		
		System.out.println("Enter the total number of integers you wish to enter");
		int x=Read.br.nextInt();
		System.out.println("Enter the integers: ");
		for(int i=0;i<x;i++) {
			int j=Read.br.nextInt();
			a.add(j);
		}
		
	}
	void secondBiggest() {
		int m=a.get(a.size()-1);
		for(int i=a.size()-2;i>=0;i--) {
			if(a.get(i)!=m) {
				System.out.println("2nd Max element is "+a.get(i));
				return;
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		IntArrProcess ap=new IntArrProcess();
		ap.read();
		ap.displayH();
		ap.displayV();
		ap.sort();
		ap.displayH();
		ap.max();
		ap.min();
		ap.sum();
		ap.secondBiggest();
		ArrayList<Integer> t= new ArrayList<Integer>(Arrays.asList(2,1,4,6,7));
		IntArrProcess p=new IntArrProcess(t);
		p.displayH();
		p.displayV();
		p.sort();
		p.displayH();
		p.max();
		p.min();
		p.sum();
		p.secondBiggest();
		ap=new IntArrProcess(p);
		ap.displayH();
		ap.displayV();
		ap.sort();
		ap.displayH();
		ap.max();
		ap.min();
		ap.sum();
		ap.secondBiggest();
	}
	
}