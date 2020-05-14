package com.java.practices;
class Address{
	int streetNum;
	String city;
	String state;
	String copuntyr;
	Address(int num,String c,String s,String coun){
		this.streetNum=num;
		this.city=c;
		this.state=s;
		this.copuntyr=coun;
	}
}

class ClgName{
      String collegeName;
      Address clgAddr;
      ClgName(String Cname,Address ADDR){
    	  
    	  this.collegeName=Cname;
    	  this.clgAddr=ADDR;
    	  
      }
}
public class AggegationJava_Student {
	int rollNum;
	String studentName;
	Address studentAdde;
	AggegationJava_Student(int roll,String name,Address addr){
		this.rollNum=roll;
		this.studentName=name;
		this.studentAdde=addr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address obj=new Address(01,"Channaptan","Karnataka","India");
		AggegationJava_Student obj1=new AggegationJava_Student(10,"Caharan",obj);
		ClgName clg=new ClgName("Cambridge",obj);
		System.out.println("Student details : ");
		System.out.println("Roll No. " + obj1.rollNum);
		System.out.println("Student Name " + obj1.studentName);
		System.out.println(obj1.studentAdde.streetNum);
		System.out.println(obj1.studentAdde.city);
		System.out.println(obj1.studentAdde.state);
		System.out.println(obj1.studentAdde.copuntyr);
		
		System.out.println("College details");
		System.out.println(clg.clgAddr.streetNum);
		System.out.println(clg.clgAddr.city);
		System.out.println(clg.clgAddr.state);
		System.out.println(clg.clgAddr.copuntyr);
	}

}
