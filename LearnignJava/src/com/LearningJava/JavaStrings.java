package com.LearningJava;
/*
   String are use to store  text which is collection of multiple character sorrounded by doouble quotes;
   
 */

public class JavaStrings {

	public static void main(String[] args) {
		
		//example 1
		String Name = "Bilal";
		String Last = "Shaikh";
		System.out.println(Name);	
		
		
		//String is an object type in java becouse it perform certain tast;
		System.out.println(Name.length());
		
		//There are many method available in srting 1 toUpperCase() 2 toLowerCase;
		System.out.println(Name.toUpperCase());
		
		System.out.println(Name.toLowerCase());
		
		//Indexof() Method is return the index(The position) of the charecter which is specified in string (including whiteSpace);
		System.out.println(Name.indexOf('l'));
		
		
		
		//String Concatenation
		//The + operator can be used between strings to combine them. This is called concatenation:
		System.out.println(Name + " " + Last);
		
		System.out.println(Name.concat(Last));
		
		
		
		// java special strings 
		System.out.println("This is an \'error\' "); //backslash and single quotes are use for single quotes ;
		
		System.out.println("This is Bilal shaikh From \"India\" ");//backslash and double quotes are use for double's quotes;
		
		System.out.println("This is Bilal shaikh From \\india\\ "); //backslash and double quotes are use foruse backslash in our strings;
		
		
	}

}
