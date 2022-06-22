package CollectionAssignments;
import java.util.TreeMap;

public class Details {
	
	public static void main(String[] args) {
		
		TreeMap<Long,ContactDetails> ts = new TreeMap<>();
		ContactDetails cd1 = new ContactDetails(43620117959l,"Ram","ram001@gmail.com");
		ContactDetails cd2 = new ContactDetails(71231466333l,"Sham","sham007@gmail.com");
		ContactDetails cd3 = new ContactDetails(94811041509l,"Tom","tommy005@gmail.com");
		ContactDetails cd4 = new ContactDetails(84811041000l,"Jerry","jerry006@gmail.com");
		
		ts.put(1l, cd1);
		ts.put(2l, cd2);
		ts.put(3l, cd3);
		ts.put(4l, cd4);
		
		for(long l:ts.keySet()) {
			System.out.println(l+" ");
		}
		
		System.out.println("........");
		
		System.out.println(ts.get(1l));
		System.out.println(ts.get(2l));
		System.out.println(ts.get(3l));
		System.out.println(ts.get(4l));
		
		System.out.println("........");
		
		System.out.println(ts);
		
		
	}

}


