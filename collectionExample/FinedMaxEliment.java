package collectionExample;
import java.util.*;
public class FinedMaxEliment {
      
	public static void main(String[] args) {
		int com=0;
		ArrayList obj=new  ArrayList();
		obj.add(10);
		obj.add(11);
		obj.add(9);
		obj.add(20);
		obj.add(18);
		
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
			int i=(int)it.next();
			
			if(com<i)
			{
				
				com=i;
				
			}
		}
		
       System.out.println(com);
	}

}
