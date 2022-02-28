package collectionExample;

import java.util.*;

public class EmpMain {

	public static void main(String[] args) {
		ArrayList<Emp> obj=new ArrayList<Emp>();
		obj.add(new Emp(101,"Amar"));
		obj.add(new Emp(102,"Nitin"));
		obj.add(new Emp(103,"Nitesh"));
		for(Object o:obj)
		{
			System.out.println(o);
		}

	}

}
