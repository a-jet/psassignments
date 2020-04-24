package com.sapient.otherexamples;

public class Conversion {

	public static String conv(int i) {
		String units[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String tens[]= {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eigthy","Ninety"};
		if(i<0) {
			return("Minus "+conv(-i));
		}
		if(i<20) {
			return (units[i]);
		}
		if(i<100) {
			return(tens[i/10]+units[i%10]);
		}
		if(i<1000) {
			return (units[i/100]+"HundredAnd"+conv(i%100));
		}
		if(i<100000) {
			return (conv(i/1000)+"Thousand"+conv(i%1000));
		}
		if(i<10000000) {
			return (conv(i/100000)+"Lakh"+conv(i%100000));
		}
		
		return (conv(i/10000000)+"Crore"+conv(i%10000000));
	}
	public static void fig_to_words(int i) {
		// TODO Auto-generated method stub
		
		System.out.println(conv(i)+"Only");
	}

}
