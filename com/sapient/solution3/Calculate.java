package com.sapient.solution3;

enum Calculate implements NumProcess{
	A((a,b)->a+b),
	S((a,b)->a-b),
	M((a,b)->a*b),
	D((a,b)->a/b);
	NumProcess n;
	Calculate(final NumProcess n) {
		this.n=n;
	}
	public double cal(double a,double b) {
		return n.cal(a, b);
	}
	/*Internally, code execution is done like this
	enum Object is declared in NumProcessRunner.java,
	Calculate c=Calculate.A;
	Constructor is called, n is assigned and cal method is defined by lambda expression,
	NumProcess n=((x,y)->x+y);
	Output is displayed on console,
	System.out.println(c.cal(a, b));
	*/
}