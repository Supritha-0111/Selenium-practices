package com.java.practices;

public class StaticMethod {
//        static int i=10;
//        static String name="Name";
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//       System.out.println(i);
//       System.out.println(name);
	
	static String name="Name";
	void methodNonStatic() {
		System.out.println("Non Static method");
		System.out.println(name);
	}
	public static void main(String[] args) {
		StaticMethod obj=new StaticMethod();
		obj.methodNonStatic();
		
		System.out.println("Static method");
		System.out.println(name);
	}
	}


