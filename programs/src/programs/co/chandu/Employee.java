package programs.co.chandu;

public class Employee {
	private int id;
	private String name;
	private double balance = 0.0;
	private double salary;

	Employee() {

	}

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = balance + salary;
		this.balance = balance + salary;

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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		balance = balance + salary;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("inside equals");
		/*
		 * col.Employee e1=new col.Employee(10); col.Employee e2=e1; boolean
		 * result=e1.equals(e2);
		 */

		if (obj == this) {
			return true;
		}
		/*
		 * col.Employee e1=new col.employee(10); col.Employee e2=null; boolean
		 * result=e1.equlas(e2); col.Employee e1=new col.Employee(10); String e2="10";
		 * boolean result=e1.equals(e2);
		 */
		if (obj == null || !(obj instanceof Employee)) {
			return false;
		}
		/*
		 * col.Employee e1=new col.Employee(10); col.Employee e2=new col.Employee(10);
		 * boolean result=e1.equals(e2);
		 */
		Employee e = (Employee) obj;// Casting to employee because object class doesnt know what is in subclasses,so
									// we need to cats
		boolean equal= e.id == this.id;
		System.out.println("INSIDE equal="+equal);
		return equal;

	}
	@Override
	public int hashCode()
	{
		return id;
	}



	public String toString() {
		return ("ID is:" + id);
	}

}
