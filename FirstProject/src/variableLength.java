//anytime you dont know how many arguments needed in a method
public class variableLength {

	public static void main(String[] args) {
		System.out.println(average(43,56,76,8));
	}
	
	public static int average(int...numbers){
		int total = 0;
		for(int x:numbers){
			total += x;
		}
			return total/numbers.length;
		
	}
}
