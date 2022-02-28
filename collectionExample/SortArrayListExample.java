package collectionExample;
import java.util.*;
public class SortArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<StudentSortExmple> obj=new ArrayList<StudentSortExmple>();
         obj.add(new StudentSortExmple(10,"Amar","IT",25000));
         obj.add(new StudentSortExmple(11,"nitin","CS",30000));
         obj.add(new StudentSortExmple(12,"nitesh","EC",35000));
         //Collections.sort((List<T>) obj);  
         System.out.println(obj);
         
         
         
}         
}
