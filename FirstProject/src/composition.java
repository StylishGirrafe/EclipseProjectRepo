
public class composition {
	private String name;
	//reference ke potpie class
	private potpie birthday;
	
	//inget ya ini constructor
	public composition(String theName, potpie theDate){
		name = theName;
		birthday = theDate;
	}
	
	//anytime you want to change object into string, use toString
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
