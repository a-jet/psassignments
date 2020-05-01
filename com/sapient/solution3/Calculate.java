package com.sapient.solution3;

enum Calculate implements NumProcess{
	A{
		public double cal(double a,double b) {
			return a+b;
		}
	},
	S{
		public double cal(double a,double b) {
			return a-b;
		}
	},
	M{
		public double cal(double a,double b) {
			return a*b;
		}
	},
	D{
		public double cal(double a,double b) {
			return a/b;
		}
	}
}