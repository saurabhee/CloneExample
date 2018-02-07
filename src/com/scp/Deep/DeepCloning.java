package com.scp.Deep;

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student1 st1=new Student1(123,"pune");
		Employee1 e1=new Employee1(1,"sauru",st1);
		Employee1 e2=(Employee1) e1.clone();
		
		System.out.println("before");
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println("After");
		e1.setName("megha");
		st1.setCity("mumbai");
		System.out.println(e1);
		System.out.println(e2);
		
		

	}

}
class Employee1 implements Cloneable
{
	int id;
	String Name;
	Student1 stu;
	//private Object stu;
	public Employee1(int id, String name, Student1 stu) {
		super();
		this.id = id;
		Name = name;
		this.stu = stu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Student1 getStu() {
		return stu;
	}
	public void setStu(Student1 stu) {
		this.stu = stu;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
	Employee1 clonedobj=(Employee1)super.clone();
		//clonedobj.stu=(Student1) this.stu.clone();
	clonedobj.setStu((Student1) clonedobj.getStu().clone());
		return clonedobj;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", Name=" + Name + ", stu=" + stu + "]";
	}
	
	
	
	
}

class Student1 implements Cloneable
{
	int pin;
	String city;
	public Student1(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		return super.clone();
	}
	@Override
	public String toString() {
		return "Student1 [pin=" + pin + ", city=" + city + "]";
	}
	
}