package com.java.practices;

public class StaticVariable {
	static int i=10;
    String name="Obj";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable obj1=new StaticVariable();
		StaticVariable obj2=new StaticVariable();
			obj1.i=20;
			obj1.name="Obj1";
			
			obj2.i=30;
			obj2.name="Obj2";
			
			System.out.println(obj1.i);
			System.out.println(obj1.name);
			System.out.println(obj2.i);
			System.out.println(obj2.name);
	}

}
