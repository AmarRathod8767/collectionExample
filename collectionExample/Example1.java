package collectionExample;

import java.util.*;

public class Example1 {
	  public void arrList()
	  {
		  /*ArrayList obj=new ArrayList();
		  obj.add("C");
		  obj.add("C++");
		  obj.add("JAVA");
		  obj.add("Paython");*/
		  
		  /*ArrayList<Integer> obj1=new ArrayList<Integer>();
		  obj1.add(10);
		  obj1.add(20);
		  obj1.add(30);
		  obj1.add(40);*/ 
		  
		  Student st=new Student();
		  ArrayList<Student> obj2=new ArrayList<Student>();
		 // obj2.add(101,"Hi");
		  st.setRno(101);
		  st.setSname("Array");
		  obj2.add(st);
		  st.setRno(102);
		  st.setSname("Arraysc");
		  obj2.add(st);
		  //obj2.setRno(123);
		  
		  for(Student o:obj2)
	        {
	            System.out.println(o.getRno()+" "+o.getSname());
	        }
		  
		  
	  }
	    	public static void main(String[] args) {
	    		Example1 ex=new Example1();
	    		ex.arrList();
		

	}

}
