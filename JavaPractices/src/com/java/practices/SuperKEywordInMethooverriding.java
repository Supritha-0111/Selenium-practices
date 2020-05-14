package com.java.practices;
class BaseClass{
	void disp() {
		System.out.println("Base class");
	}
}
public class SuperKEywordInMethooverriding extends BaseClass{
	void disp() {
		System.out.println("Sub-Class");
	}
	
	void PrintMsg() {
		disp();
		//super.disp();
		System.out.println("Hello!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKEywordInMethooverriding obj=new SuperKEywordInMethooverriding();
		obj.PrintMsg();
	}

}
