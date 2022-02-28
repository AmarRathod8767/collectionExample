package collectionExample;
import java.util.*;
public class LinkedHasSetExample {

	public static void main(String[] args) {
		LinkedHashSet hs1=new LinkedHashSet();
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
		

	}

}
