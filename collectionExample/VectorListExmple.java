package collectionExample;
import java.util.*;
public class VectorListExmple {

	public static void main(String[] args) {
		  Vector obj = new Vector();
	        obj.add("C");
	        obj.add("CPP");
	        obj.add("JAVA");
	        obj.remove("C");
	        obj.add("PHP");
	        obj.add(1001);
	      
	        for(Object o:obj)
	        {
	            System.out.println(o);
	        }

	}

}
