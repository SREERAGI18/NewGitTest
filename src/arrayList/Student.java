package arrayList;
import java.util.*;

public class Student {

	public static void main(String[] args) {
		
		List<StudentInfo> studs = new ArrayList<>();
		
		studs.add(new StudentInfo(3, 45));
		studs.add(new StudentInfo(1, 0));
		studs.add(new StudentInfo(5, 15));
		studs.add(new StudentInfo(4, 37));
		studs.add(new StudentInfo(2, 40));
		
		Collections.sort(studs, (n1, n2) -> {
			
			return n1.marks > n2.marks ? -1 : n1.marks < n2.marks ? 1:0;
		}
		);
		
		for(StudentInfo s: studs) {
			System.out.println(s);
		}

	}
	
	

}

class StudentInfo {
	int rollNo;
	int marks;
	
	public StudentInfo(int no , int marks ){
		this.rollNo = no;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [" + "Roll no = "+rollNo +", Marks = "+ marks+"]";
	}
}
