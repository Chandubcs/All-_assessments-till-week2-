package programs.co.chandu;

import java.util.*;

public class SetEx {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "chandu", 200.0);
		Employee e2 = new Employee(1, "chandu", 200.0);
		boolean equals=e1.equals(e2);
    Comparator<Employee>comparator=new EmployeeComparator();


	
		 Set<Employee> set=new LinkedHashSet();//set is of datatype Employee,which is a class
		set.add(e1);
		set.add(e2);
		System.out.println(set);
		SetEx ex=new SetEx();
		ex.print(set);
	}
	
	public void print(Set<Employee> set)
	{
		for(Object o:set)
		{
			Employee e=(Employee)o;//Casting to this specific subclass//always you should caste to subclass type,else error
			System.out.println(e.getId()+ " "+e.getName());
		}
	}
		
		
		
	
	}

