package com.java.practices;

public class ConstructorJava {
        int empId;
        String name;
        ConstructorJava(int id,String eName){   // Prameterized constructor
        	this.empId=id;
        	this.name=eName;
        }
        
        public void pm() {
        	System.out.println(+empId+" "+name);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorJava obj1=new ConstructorJava(798720,"Supritha");
		ConstructorJava obj2=new ConstructorJava(798721,"Mythri");
		obj1.pm();
		obj2.pm();
	}

}
