import java.sql.Date;
import java.util.LinkedList;

public class DateOfBirth {
	public Date date;
	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("09-03-1998");
		l.add("13-06-1993");
		l.add("08-07-2016");
		l.add("22-01-1999");
		
		for(int i=0;i<l.size();i++) {
			String s=l.get(i).toString();
			String [] s1 = s.split("-");
			int year = Integer.parseInt(s1[2]);
			if((year%4==0) && (year%100!=0) || year%400==0) {
				System.out.println("The date is "+l.get(i)+" is a leap year");
			}
			else {
				System.out.println("The date is "+l.get(i)+" is not a leap year");
			}
			
		}
		
		
	}

}
