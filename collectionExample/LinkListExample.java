package collectionExample;

import java.util.*;

public class LinkListExample {
	public static void main(String[]args)
	{
		LinkedList lk=new LinkedList();
		lk.add(101);
		lk.add(103);
		lk.add("java");
		lk.add('A');
		lk.add(10.5F);
		lk.add(203.256);
		lk.add("h ir r w");
		System.out.println("first arryList lk");
		for(Object o:lk)
		{
			System.out.println(o);
		}
		
		LinkedList<Integer> lki=new LinkedList<Integer>();
		lki.add(10);
		lki.add(11);
		lki.addFirst(222222111);
		lki.add(12);
		lki.add(9);
		lki.addLast(1000);
		lki.add(101);
		lki.add(14);
		lki.addFirst(1);
		lki.addLast(1000);
		//lki.remove();
		lki.remove(lki);
		lki.addFirst(222222222);
		System.out.println("Second arryList lki");
		for(Object o:lki)
		{
			System.out.println(o);
		}
		System.out.println("Add all");
		lk.addAll(3,lki);
		for(Object o:lk)
		{
			System.out.println(o);
		}
		
		
	}

}
