package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		//ArrayList obj=new ArrayList();
		//List obj=new ArrayList();
		//ArrayList<Integer> obj=new ArrayList<Integer>();
		List<Integer> obj=new ArrayList<Integer>();
		
	    
		
		
		obj.add(10);
		obj.add(125);
		obj.add(1000);
		obj.add(5000);
		obj.add(300);
		//obj.add("Amar");
		//obj.add('A');
		//obj.add(12.235);
		//obj.add('@');
		/*System.out.println("Array list variablr");
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println("Array list variablr");
        for(Object o:obj)
        {
        	System.out.println(o);
        }*/
		System.out.println("It is forword Itrator");
		Iterator<Integer> it=obj.iterator();
		while(it.hasNext())
		{
			Integer s=it.next();
			System.out.println(s);
			
		}
		
		
		System.out.println("It is forword Itrator");
		ListIterator<Integer> it1=obj.listIterator();
		while(it1.hasNext())
		{
			Integer s=it1.next();
			System.out.println(s);
			
		}
		
		while(it1.hasPrevious())
		{
			Integer s = it1.previous();
			System.out.println(s);
		}
	}

}
