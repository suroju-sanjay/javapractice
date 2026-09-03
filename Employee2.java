package project1;

public class Employee2 {
int id;
String name;
int salary;
 Employee2(int id,String name,int salary) {
	 this.id=id;
	 this.name=name;
	 this.salary=salary;	 
}
	public static void main(String[] args) {
		Employee2 e1=new Employee2(101,"tharun",70000);
		e1.display();
	Employee2 e2= new Employee2(101,"prashanth",50000);
	e2.display();
	}
void display() {
	System.out.println("employee id :"+id);
	System.out.println("employee name :"+name);
	System.out.println("employee salary :"+salary);
	System.out.println("*******************************");
}
}