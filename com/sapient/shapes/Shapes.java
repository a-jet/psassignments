package com.sapient.shapes;

public  class Shapes {
	static void calculateShapeArea(int numberOfSides,int length) {
		if(length<0) {
			System.out.println("Invalid length");
		}
		else if(numberOfSides==1) {
			Circle c=new Circle();
			c.calculateArea(length);
		}
		else if(numberOfSides==3) {
			Triangle t=new Triangle();
			t.calculateArea(length);
		}
		else if(numberOfSides==4) {
			Square s=new Square();
			s.calculateArea(length);
		}
		else {
			System.out.println("No shapes present");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateShapeArea(3,12);
		calculateShapeArea(4,15);
		calculateShapeArea(5,15);
	}

}
