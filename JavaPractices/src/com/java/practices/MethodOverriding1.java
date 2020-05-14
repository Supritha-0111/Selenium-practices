package com.java.practices;
class ABC{
	void disp() {
		System.out.println("Mrthod A");
	}
}
public class MethodOverriding1 {
	void disp() {
		System.out.println("Method B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC obj=new ABC();
		obj.disp();

	}

}
