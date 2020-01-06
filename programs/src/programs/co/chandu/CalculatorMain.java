package programs.co.chandu;


public class CalculatorMain {
	public static void main(String[] args)
	{
		Calculator c=new Calculator();//creating object of already written class and using its functions
	
	int resultadd = c.add(2,3);
	int resultsubstract = c.substract(2,3);
	String resultstring=c.add("hey","dude");//double quotes for String
	System.out.println(resultadd);
	System.out.println(resultsubstract);
	System.out.println(resultstring);
	
}
}
