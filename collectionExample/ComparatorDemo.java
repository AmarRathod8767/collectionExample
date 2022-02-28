package collectionExample;

import java.util.*;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet<CompratorStuExample> obj=new TreeSet<CompratorStuExample>(new FeeComprator());
        obj.add(new CompratorStuExample(101,"nitin",1000));
        obj.add(new CompratorStuExample(102,"Nitesh",500));
        obj.add(new CompratorStuExample(103,"Amar",500));
        for(CompratorStuExample o:obj)
        {
        	System.out.println(o.rno+","+o.sname+" ,"+o.fee);
        }
	}

}
