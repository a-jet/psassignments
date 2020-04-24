package com.sapient.otherexamples;

public class OtherExampleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommandLine1 cl=new CommandLine1();
		cl.setData(args);
		cl.calData();
		cl.sumData();
		cl.avgData();
		cl.biggestData();
		cl.smallestData();
		KeyReadLine2 k=new KeyReadLine2();
		k.read();
		k.display();
		k.sort();
		k.find(5);
		Conversion.fig_to_words(898578905);
	}

}
