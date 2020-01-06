package programs.co.chandu;

import java.util.*;

public class ArrList {
	public static void main(String[] args) {
		List list=new ArrayList();//no size mentioned,even no problem,size extends as we add
		for(int i=0;i<9;i++)
		{
		list.add(i);
		
	 }
		Object o=list.get(0);
		int firstelement=(int)o;//convert to int because it is stored as object
		System.out.println(firstelement);
		
		ArrList ex=new ArrList();
		list.remove(4);
		ex.print(list);
	

}
	public void print(List list)
	{
		 for(Object e:list)
		 {
			 int num=(int)e;
			 System.out.println(num);
		 }
	}
}
