
public class statics {
	private String first;
	private String last;
	//static gunanya buat object lain juga bisa baca dan akses variable yg sama
	private static int members = 0;
	
	public statics(String fn, String ln){
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
	}
	
	
}
