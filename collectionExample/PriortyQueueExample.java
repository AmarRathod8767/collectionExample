package collectionExample;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriortyQueueExample {

	public static void main(String[] args) {
	  //  PriorityQueue obj=new PriorityQueue();
	   ArrayDeque obj=new ArrayDeque();
	    obj.add(12);
	    obj.add(13);
	    obj.addFirst(2);
	    obj.add(10);
	    obj.addLast(55);
	    obj.add(9);
	    obj.addFirst(20);
	    for(Object o:obj)
	    {
	    	System.out.println(o);
	    }
	    

	}

}
