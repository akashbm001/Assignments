import java.util.Comparator;

public class SortByDepartment implements Comparator<Employee>{
	@Override
	public int compare(Employee a1 , Employee a2) {
		return a1.getDepartment().compareTo(a2.getDepartment());
	}

}