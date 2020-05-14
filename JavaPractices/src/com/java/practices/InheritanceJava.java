package com.java.practices;
class Teacher{
	String designation="Teacher";
	String clg="Cambridge";
	void work() {
		System.out.println("Teacher");
	}
	}


public class InheritanceJava extends Teacher {
	String s="Musice";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceJava obj=new InheritanceJava();
		System.out.println(obj.s);
		System.out.println(obj.designation);
		System.out.println(obj.clg);
		obj.work();
       
	}

}
