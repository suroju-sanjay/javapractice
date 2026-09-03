package project1;

public class Employee{
	int employeeId;
	String employeeName;
	int age;
	int salary;
	String department;

	Employee() {
		System.out.println("no arg constructor called");
		employeeId = 101;
		employeeName="shiva";
		age=21;
		salary=25000;
	}
	Employee(int employeeId,String employeeName,int age,int salary,String department){
		System.out.println("parameterized constructor called");
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.age=age;
		this.salary=salary;
		this.department=department;
	}
	void EmployeeInfo() {
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Employee name :"+employeeName);
		System.out.println("Employee age :"+age);
		System.out.println("Employee salary :"+salary);
		System.out.println("Employee department :"+department);
		System.out.println("*************************************");
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee e1=new Employee();
		e1.employeeId=8790;
		e1.employeeName="tharun";
		e1.age=26;
		e1.salary=20000;
		e1.department="account";
		e1.EmployeeInfo();
		Employee e2= new Employee();
		e2.EmployeeInfo();
		Employee e3=new Employee(9912,"skchary",55,70000,"carpenter");
		e3.EmployeeInfo();
		System.out.println("main method ended");
	}

}
