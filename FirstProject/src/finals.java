
public class finals {
	private int sum;
	//final means cannot be change
	private final int NUMBER;
	
	public finals(int x){
		NUMBER = x;
	}
	
	public void add(){
		sum += NUMBER;
	}
	
	public String toString(){
		return String.format("sum = %d\n", sum);
	}
	
	
}
