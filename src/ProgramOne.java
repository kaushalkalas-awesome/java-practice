
class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		System.out.println("Name: "+this.name+"\nAge: "+this.age);
	}
}

class Employee extends Person{
	private int id;
	private double salary;
	
	Employee(String name, int age, int id, double salary){
		super(name,age);
		this.id=id;
		this.salary=salary;
	}
	
	public void display() {
		super.display();
		System.out.println("ID: "+this.id+"\nSalary: "+salary);
	}
}

public class ProgramOne {

	public static void main(String[] args) {
		
		Person p = new Person("K3",29);
		p.display();
		
		Employee e = new Employee("kaushal",20,123,1000.00);
		e.display();

	}

}
