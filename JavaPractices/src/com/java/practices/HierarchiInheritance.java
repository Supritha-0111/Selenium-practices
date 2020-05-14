package com.java.practices;
class A{
	public void methosA() {
		System.out.println("Class A");
	}
}

class B extends A{
	public void methodB() {
		System.out.println("Class B");
	}
}
class C extends A{
	public void methodC() {
		System.out.println("Class C");
	}
}
public class HierarchiInheritance extends A{
    public void methodHI() {
      System.out.println("Class HI");	
    }
    public static void main(String[] args) {
		B obj1=new B();
		C obj2=new C();
		HierarchiInherit obj3=new HierarchiInherit();
		obj1.methosA();
		obj2.methosA();
		obj3.methosA();
	}
    }
