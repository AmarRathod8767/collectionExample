package collectionExample;

public class StudentSortExmple {
   
	@Override
	public String toString() {
		return "\nStudentSortExmple sno=" + sno + ", name=" + name + ", branch=" + branch + ", fee=" + fee;
	}
	private int sno;
	private String name;
	private String branch;
	private int fee;
	public StudentSortExmple(int sno, String name, String branch, int fee) {
		
		this.sno = sno;
		this.name = name;
		this.branch = branch;
		this.fee = fee;
	}
	
}
