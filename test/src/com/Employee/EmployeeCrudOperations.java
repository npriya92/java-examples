package com.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCrudOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	EmployeeCrudOperations empcr = new EmployeeCrudOperations();
	
	empcr.createEmployee();
	empcr.updateEmployee();
	empcr.deleteEmployee();
	
	}
	List<Employee> empList = new ArrayList <Employee>();
	
	public void createEmployee( ) {
	Employee emp1 =	new Employee ();
	emp1.setFirstName("David");
	emp1.setLastName("Hordnet");
	emp1.setAge(25);
	emp1.setDesignation("Developer");
	empList.add(emp1);
	
	Employee emp2 =	new Employee ();
	emp2.setFirstName("Stephen");
	emp2.setLastName("Palmer");
	emp2.setAge(27);
	emp2.setDesignation("Devloper");
	empList.add(emp2);
	
	Employee emp3 =	new Employee ();
	emp3.setFirstName("Jackson");
	emp3.setLastName("Rosa");
	emp3.setAge(28);
	emp3.setDesignation("Developer");
	empList.add(emp3);
	
	Employee emp4 =	new Employee ();
	emp4.setFirstName("Rocky");
	emp4.setLastName("Pinson");
	emp4.setAge(30);
	emp4.setDesignation("TeamLead");
	empList.add(emp4);
	
	Employee emp5 =	new Employee ();
	emp5.setFirstName("Jim");
	emp5.setLastName("Coop");
	emp5.setAge(31);
	emp5.setDesignation("ScrumMaster");
	empList.add(emp5);
	
	Employee emp6 =	new Employee ();
	emp6.setFirstName("Dave");
	emp6.setLastName("Watson");
	emp6.setAge(35);
	emp6.setDesignation("ProductManager");
	empList.add(emp6);
	
	Employee emp7 =	new Employee ();
	emp7.setFirstName("Sonam");
	emp7.setLastName("Pandey");
	emp7.setAge(37);
	emp7.setDesignation("Architect");
	empList.add(emp7);
	
	Employee emp8 =	new Employee ();
	emp8.setFirstName("Ryan");
	emp8.setLastName("Cooper");
	emp8.setAge(39);
	emp8.setDesignation("Manager");
	empList.add(emp8);
	
	Employee emp9 =	new Employee ();
	emp9.setFirstName("Benjamin");
	emp9.setLastName("Rosa");
	emp9.setAge(45);
	emp9.setDesignation("Director");
	empList.add(emp9);
	
	Employee emp10 = new Employee ();
	emp10.setFirstName("Mike");
	emp10.setLastName("Moore");
	emp10.setAge(50);
	emp10.setDesignation("Vicepresident");
	empList.add(emp10);
	for(Employee emp:empList) {
		System.out.println( emp.getFirstName() +" " +emp.getLastName() +"age is " +emp.getAge() +" designation is" +emp.getDesignation() +"/n" );
	}
	}
	
	public void updateEmployee() {
		Employee empUpdate = new Employee ();
		empUpdate.setFirstName("Dave");
		empUpdate.setLastName("Watson");
		empUpdate.setAge(35);
		empUpdate.setDesignation("Senior ProductManager");
		empList.set(6,empUpdate);
		for(Employee emp:empList) {
			System.out.println( emp.getFirstName() +" " +emp.getLastName() +"age is " +emp.getAge() +" designation is" +emp.getDesignation() +"/n" );			
		}
		}
	public void deleteEmployee() {
		empList.remove(2);
		empList.remove(4);
		empList.remove(6);
		for(Employee emp:empList) {
			System.out.println( emp.getFirstName() +" " +emp.getLastName() +"age is " +emp.getAge() +" designation is" +emp.getDesignation() +"/n" );			
		}
	}
	
	}
	

	


