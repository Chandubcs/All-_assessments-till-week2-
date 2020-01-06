package programs.co.chandu;

public class EmployeeMain{
	public EmployeeMain() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args)
{
	Employee store[]=new Employee[3];
  	
	store[0]=new Employee(1,"abc",500.0);
	store[2]=new Employee(3,"ghi",2500.0);
	Manager m1=new Manager(2,"manager",3523.38);
	store[1]=m1;
	m1.addManagedEmployees(store[0]);
	m1.addManagedEmployees(store[2]);
	EmployeeMain em=new EmployeeMain();
	em.print(store);
	/*
	for(int i=0;i<3;i++)
	{
	System.out.println(store[i].toString());//store[1].getId();
	
	}
	*/
}
 public void print(Employee store[])
	{    
	 for(Employee e: store)
	 {
		 System.out.println(e.getName()+e.getBalance());
		 boolean isManager =e instanceof Manager;
		 if(isManager)
		 {
			 Manager m=(Manager)e;
			
			 
		 }
	 }
	 {
		
	 }
    }
}

