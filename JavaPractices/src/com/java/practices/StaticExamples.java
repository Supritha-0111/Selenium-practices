package com.java.practices;

public class StaticExamples {
	
     //static method 
//	static void myMethod() {
//		System.out.println("myMethod");
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        myMethod();
//	}

	
	//Static blocks
	static int num;
	static String name;
	static {
		System.out.println("Block 1");
		num=20;
		name="Block 1";
	}
	
	static {
		System.out.println("Block 2");
		num=30;
		name="Block 2";
	}
	
	public static void main(String[] args) {
		System.out.println(num);
		System.out.println(name);
	}
}
