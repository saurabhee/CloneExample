package com.scp.Shallow;

public class ShallowClonning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
        Address ad1=new Address(123,"pune");
       Employee e1=new Employee(1,"sauru",ad1);
	    Employee e2=(Employee) e1.clone();
	    
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1==e2);
		System.out.println(e1.getClass()==e2.getClass());
		System.out.println(e1.equals(e2));       //object class equals method
		
	
		e1.setName("niku");
		System.out.println(e1);
	     System.out.println(e2);
		
		//Address ad2=new Address(345,"mumbai");
	     ad1.setCity("Mumbai");
		
		//e2.setAd(ad2);
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
class Employee implements Cloneable
{
	int id;
	String name;
	Address ad;
	public Employee(int id, String name,Address ad) {
		super();
		this.id = id;
		this.name = name;
		this.ad=ad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", ad=" + ad + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
		
}

class Address implements Cloneable
{
	int pin;
	String city;
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
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	
	
}