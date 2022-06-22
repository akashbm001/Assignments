import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{
	
	@Override
	public int compare(Employee a1, Employee a2) {
		return  a1.getSalary()-a2.getSalary();
	}

}