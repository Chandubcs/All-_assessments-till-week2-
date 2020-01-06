package programs.co.chandu;

public class Manager extends Employee{
	public Manager() {
		
		// TODO Auto-generated constructor stub
	}
 private int i=0;
 private Employee managedEmployees[]=new Employee[2];
 public Employee[] getManagedEmployees() 
 {
	 return managedEmployees;
 }
 public Manager(int id,String name,double salary)
 {
	 super(id,name,salary);
 }
 public void addManagedEmployees(Employee e) {
	 managedEmployees[i]=e;
	 i++;
 }
 

}
