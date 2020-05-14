package com.java.practices;
class SuperClass{
	SuperClass(){
		System.out.println("Super class no=arg constructor");
	}
	
	SuperClass(String str){
		System.out.println("Superclass arg constructor");
	}
}
public class SuperKeyword extends SuperClass {
	
	SuperKeyword(){
		//super();
		System.out.println("Sub-class constructor");
	}
	 void disp() {
		 System.out.println("Hello!");
	 }
	
	
	public static void main(String[] args) {
		SuperKeyword obj=new SuperKeyword();
		obj.disp();
	}
	
//	int num=200;
//	void printNumber() {
//	
//		System.out.println(num);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		SuperKeyword obj=new SuperKeyword();
//		obj.printNumber();
	//}

	
	// to call parent class constructor
	
	
}
