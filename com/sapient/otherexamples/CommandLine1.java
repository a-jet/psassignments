package com.sapient.otherexamples;

public class CommandLine1 {

	Integer[] data;
	boolean present=false;

	public void setData(String[] arg) {
		// TODO Auto-generated method stub
		data=new Integer[arg.length];
		present=true;
		for(int i=0;i<arg.length;i++) {
			data[i]=Integer.parseInt(arg[i]);
		}
		
	}

	public void calData() {
		// TODO Auto-generated method stub
		if(!present) {
			System.out.println("No data");
			return;
		}
		System.out.println("Data present :");
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
	}

	public void sumData() {
		// TODO Auto-generated method stub
		if(!present) {
			System.out.println("No data");
			return;
		}
		int sum=0;
		for(int i=0;i<data.length;i++) {
			sum+=data[i];
		}
		System.out.println("Sum ="+sum);
		
	}

	public void avgData() {
		// TODO Auto-generated method stub
		if(!present) {
			System.out.println("No data");
			return;
		}
		int sum=0;
		for(int i=0;i<data.length;i++) {
			sum+=data[i];
		}
		double avg=(double)sum/data.length;
		System.out.println("Average :"+avg);
	}

	public void biggestData() {
		// TODO Auto-generated method stub
		if(!present) {
			System.out.println("No data");
			return;
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<data.length;i++) {
			if(data[i]>max)
				max=data[i];
		}
		System.out.println("Maximum value :"+max);
	}

	public void smallestData() {
		// TODO Auto-generated method stub
		if(!present) {
			System.out.println("No data");
			return;
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<data.length;i++) {
			if(data[i]<min)
				min=data[i];
		}
		System.out.println("Minimum value :"+min);
	}


}
