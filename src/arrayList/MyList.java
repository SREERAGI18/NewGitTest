package arrayList;
import java.util.*;

public class MyList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(45);
		list.add(2);
		list.add(67);
		list.add(100);
		
		Comparator<Integer> com = new MyComparator<>();
		
		Collections.sort(list, com);
		
		System.out.print(list);
 
	}

}
