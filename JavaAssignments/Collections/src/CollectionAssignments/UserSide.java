package CollectionAssignments;
import java.util.Scanner;
import java.util.TreeSet;



public class UserSide {

	public static void main(String[] args) {
		System.out.println("1-Id");
		System.out.println("2-Name");
		System.out.println("3-Department");
		System.out.println("4-Salary");

		Scanner sc = new Scanner(System.in);
		System.out.print("Type your Choice: ");

		String str = sc.nextLine();
		if (str.equals("Name")) {
			TreeSet<Employee> Emp = new TreeSet<Employee>(new SortByName());
			
			Emp.add(new Employee(5, "Akash", "Hr", 85000));
			Emp.add(new Employee(7, "Nitish", "Backend", 45000));
			Emp.add(new Employee(3, "Rahul", "Testing", 25000));
			Emp.add(new Employee(9, "Vinayak", "Acounting", 65000));
			Emp.add(new Employee(6, "Shrey", "Testing", 55000));
			Emp.add(new Employee(8, "Omkar", "Acountiing", 55000));
			for (Employee e : Emp) {
				System.out.println(e);
			}
		} else if (str.equals("Id")) {
			TreeSet<Employee> Emp = new TreeSet<Employee>(new SortById());
			Emp.add(new Employee(5, "Akash", "Hr", 85000));
			Emp.add(new Employee(7, "Nitish", "Backend", 45000));
			Emp.add(new Employee(3, "Rahul", "Testing", 25000));
			Emp.add(new Employee(9, "Vinayak", "Acounting", 65000));
			Emp.add(new Employee(6, "Shrey", "Testing", 55000));
			Emp.add(new Employee(8, "Omkar", "Acountiing", 55000));
			for (Employee e : Emp) {
				System.out.println(e);
			}
		} else if (str.equals("Salary")) {
			TreeSet<Employee> Emp = new TreeSet<Employee>(new SortBySalary());
			Emp.add(new Employee(5, "Akash", "Hr", 85000));
			Emp.add(new Employee(7, "Nitish", "Backend", 45000));
			Emp.add(new Employee(3, "Rahul", "Testing", 25000));
			Emp.add(new Employee(9, "Vinayak", "Acounting", 65000));
			Emp.add(new Employee(6, "Shrey", "Testing", 55000));
			Emp.add(new Employee(8, "Omkar", "Acountiing", 55000));
			for (Employee e : Emp) {
				System.out.println(e);
			}
		} else if (str.equals("Department")) {
			TreeSet<Employee> Emp = new TreeSet<Employee>(new SortByDepartment());
			Emp.add(new Employee(5, "Akash", "Hr", 85000));
			Emp.add(new Employee(7, "Nitish", "Backend", 45000));
			Emp.add(new Employee(3, "Rahul", "Testing", 25000));
			Emp.add(new Employee(9, "Vinayak", "Acounting", 65000));
			Emp.add(new Employee(6, "Shrey", "Testing", 55000));
			Emp.add(new Employee(8, "Omkar", "Acountiing", 55000));
			for (Employee e : Emp) {
				System.out.println(e);
			}
		}
	}
}