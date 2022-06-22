import java.util.Comparator;

public class SortById implements Comparator<Employee>{
	@Override
	public int compare(Employee a1,Employee a2) {
		return a1.getId()-a2.getId();
	}

}