package com.casting;

class Person{
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void getName() {
		System.out.println("Name: "+this.name);
	}
	
	public void display() {
		System.out.println("Name: "+this.name+"\nAge: "+this.age);
	}
}

class Employee extends Person{
	private int id;
	private double salary;
	
	public Employee(){
		
	}
	
	public Employee(String name, int age, int id, double salary){
		super(name,age);
		this.id=id;
		this.salary=salary;
	}
	
	@Override
	public void display() {
		System.out.println("ID: "+this.id+"\nSalary: "+salary);
	}
	
	public void someThing() {
		System.out.println("Somthing.....");
	}
}

public class ProgramOne {

	public static void main(String[] args) {
		
		Person p = new Employee("kaushal", 20, 1235,1000.00); //-->Upcasting
		p.display();	 //calling employee method due to dynamic method dispatch
		p.getName(); //Person's method
		
		Employee emp = (Employee) p; //-->Downcasting
		emp.display(); //calling employee method
		emp.someThing();
		emp.getName(); //inherited from Person

	}

}
