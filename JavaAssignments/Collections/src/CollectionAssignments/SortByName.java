package CollectionAssignments;
import java.util.Comparator;

public class SortByName implements Comparator<Employee> {
	SortByName(){
		
	}
	@Override
	public int compare(Employee a1 , Employee a2) {
		return a1.getName().compareTo(a2.getName());
	}

}