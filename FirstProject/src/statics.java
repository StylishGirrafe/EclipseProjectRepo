
public class statics {
	private String first;
	private String last;
	//static gunanya buat object lain juga bisa baca dan akses variable yg sama
	//static variable is shared to all other objects
	//bisa lsg dipanggil dari class nya sendiri (ga perlu spesifik harus dari object)
	private static int members = 0;
	
	public statics(String fn, String ln){
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
	}
	public String getFirst(){
		return first;
	}
	
	public String getLast(){
		return last;
	}
	
	public static int getMembers(){
		return members;
	}
	
	
}
