package com.LearningJava;
/*
	Java Type Casting
	Type casting is when you assign a value of one primitive data type to another type.
	
	In Java, there are two types of casting:
	
	Widening Casting (automatically) - converting a smaller type to a larger type size
	byte -> short -> char -> int -> long -> float -> double
	
	Narrowing Casting (manually) - converting a larger type to a smaller size type
	double -> float -> long -> int -> char -> short -> byte
	
	
*/

public class JavaTypeCasting {

	public static void main(String[] args) {
		//Widening Casting
		//Widening casting is done automatically when passing a smaller size type to a larger size type:
		  
		int Mynum=15;
		double Mydouble=Mynum;
		System.out.println(Mydouble);
		
		
		
		
//		Narrowing casting 
//		must be done manually by placing the type in parentheses in front of the value:
		
		
		long x = 1800201510;
		int y= (int)x;
		System.out.println(y);
		
		
//		whene ever we try  to convert large data type into small data type so at that time data loss
//		e:g
		
		long a = 1800201510;
		short b= (short)a;
		System.out.println(b);
		
		
		
				

	}

}
