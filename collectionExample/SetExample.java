package collectionExample;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
        hs.add(120);
        hs.add(121);
        hs.add("hs");
        hs.add('@');
        hs.add(300);
        hs.add(500);
        hs.add("hs");
        hs.add('@');
        hs.add(500);
        hs.add(200000);
        for(Object o:hs)
        {
        	System.out.println(o);
        }
        System.out.println("second");
        HashSet hs1=new HashSet();
        hs1.add(120);
        hs1.add(121);
        hs1.add("hs");
        hs1.add('@');
        hs1.add(300);
        hs1.add(500);
        hs1.add("hs");
        hs1.add('@');
        hs1.add(500);
        hs1.add(1000);
        for(Object o:hs1)
        {
        	System.out.println(o);
        }
        System.out.println("Add ALl");
        hs.addAll(hs1);
        for(Object o:hs)
        {
        	System.out.println(o);
        }
	}

}
