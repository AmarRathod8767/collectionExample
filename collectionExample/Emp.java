package collectionExample;

public class Emp {
	private int empid;
	private String empname;
	Emp(int empid, String empname)
	{
		this.empid=empid;
		this.empname=empname;
		
	}
	
	public String toString()
	{
		return "Employe id: "+empid+" employee name: "+empname;
	}

}
