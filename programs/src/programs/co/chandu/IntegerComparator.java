package programs.co.chandu;
import java.util.*;


	public class IntegerComparator implements Comparator<Integer>//creating class called IntegerComparator for already existing inbuilt INTERFACE Comparator ,
	{//so we will write here in this class what to compare and how to compare,just like a function.
		@Override//input to this class is COMPLETE LIST because you are calling with LIST only,iee.,list.sort(comparator); ,so i/p is automatically list
		public int compare(Integer o1,Integer o2)//these are elements in list,OK,iee,list[0] ,list[1] ,like that
		{
			int num1=01;//convert obj to int to print
			int num2=02;//similarily,convert every value in list to int if we want int to get printed
			if(num1>num2)
				return 1;
			if(num1<num2)
				return -1;
			else
				return 0;
			
			
		}
	}


