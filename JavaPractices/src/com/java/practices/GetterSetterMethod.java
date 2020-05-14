package com.java.practices;
class Teacher{
	private String designation="Teacher";
    private String clgName="Cambridge";
    
    public String getDesignation() {
    	return designation;
    }
    
    protected void setDesignation(String designation) {
    	this.designation=designation;
    }
    
    public String getClgname() {
    	return clgName;
    }
    
    protected void setClgname(String clgName) {
    	this.clgName=clgName;
    }
    
    void work() {
    	System.out.println("Teacher");
    }
}
public class GetterSetterMethod extends Teacher{
	     String sub="Music";
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
    		GetterSetterMethod obj=new GetterSetterMethod();
    		System.out.println(obj.getDesignation());
    		System.out.println(obj.getClgname());
    		System.out.println(obj.sub);
    		obj.work();
	}

}
