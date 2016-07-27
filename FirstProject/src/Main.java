import java.util.Scanner;
public class Main {
/*public class apples {
	
	public static void main(String[] args) {
		//whatever we type in keyboard will be held by yoyo
	Scanner yoyo = new Scanner(System.in);
	double fnum, snum, answer;
	System.out.println("Enter first num: ");
	fnum = yoyo.nextDouble();
	System.out.println("Enter second num: ");
	snum = yoyo.nextDouble();
	answer = fnum+snum;
	System.out.println(answer);
	}

}*/
	public static void main(String[] args){
		//create object
		/*tuna tunaObject = new tuna();
		tunaObject.simpleMessage();*/
		
		//make scanner object
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna("Kelsey");
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		//tunaObject.simpleMessage(name);
		
		System.out.println("Enter name of first gf:");
		String temp = input.nextLine();
		tunaObject.setName(temp);
		tunaObject.saying();
		
		condoperand condo = new condoperand();
		condo.yaho();
		
		compoundInterest coi = new compoundInterest();
		coi.ahoy();
		coi.ahoyy();
	}
}
