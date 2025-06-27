package com.casting;

class A{
	 protected void displayRecord() {
		 System.out.println("A.displayRecord()");
	 }
	 
	 protected void showDetail() {
		 System.out.println("A.showDetail()");
	 }
}

class B extends A{
	public void displayRecord() {
		System.out.println("B.displayRecord()");
	}
	
	void printRecord() {
		System.out.println("B.printRecord()");
	}
}

public class ProgramTwo {

	public static void main(String[] args) {
		A a = new B();
		
		a.displayRecord(); //calls B method() -->Dynamic method dispatch
		a.showDetail(); //calls A method()
		
		
		if (a instanceof B) {
		    B b = (B) a;
		    b.printRecord(); //calls B method()
		}

	}

}
