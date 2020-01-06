package programs.co.chandu;

import java.util.*;
//same code as ArrayList except the declaration ,thats it

public class LinkList {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList();//no size mentioned,even no problem,size extends as we add
		for(int i=0;i<9;i++)
		{
		list.add(i);
		
	 }
		System.out.println("LIST SIZE IS :"+list.size());
		int firstelement=list.get(0);//convert to int because it is stored as object
		System.out.println(firstelement);
		
		LinkList ex=new LinkList();
		list.remove(4);
		ex.print(list);
		System.out.println("contains:"+list.contains(3));
		System.out.println("Element added or not :"+list.add(12));//adds and returns true if add  is successful
	//	ex.print(list);
		ex.printByIterator(list);
		IntegerComparator comparator=new IntegerComparator(); //creating object of IntegerComparator CLASS which we created to sort the list
		list.sort(comparator);//passing to method
		ex.print(list);//passing list to IntegerComparator
	    

}
	public void print(List<Integer> list)
	{
		 for(int num :list)
		 {
			 //int num=(int)o;
			 System.out.println(num);
		 }
	}
	
	public void printByIterator(List<Integer> list)//List-Keyword,list-variable of listtype
	{
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext())
		{
			int num=iterator.next();//everything in lists or collections are stored in object TYPE, so we should convert to print
			//accessing elements by next() method;
			//int num=(int)o;//converting the object type to our requirement
			System.out.println("ELEMENT:"+num);
		}
	}
}

