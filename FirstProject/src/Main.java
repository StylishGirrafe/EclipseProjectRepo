import java.util.Scanner;
import java.util.EnumSet;

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
		
		testLoop tl = new testLoop();
		tl.ayo();
		
		arrayCounters ac = new arrayCounters();
		ac.arrayCount();
		
		//Time class
		Time timeObject = new Time();
		System.out.println(timeObject.toMilitary());
		timeObject.setTime(13, 27, 6);
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());
		
		//multipleConstructors
		multipleConstructors mc = new multipleConstructors();
		multipleConstructors mc2 = new multipleConstructors(5);
		multipleConstructors mc3 = new multipleConstructors(5,13);
		multipleConstructors mc4 = new multipleConstructors(5,13,43);
		
		System.out.printf("%s\n", mc.toMilitary());
		
		//toString
		potpie potObject = new potpie(4,5,6);
		composition comp = new composition("Greg", potObject);
		
		System.out.println(comp);
		
		//enumeration
		for(enumeration people: enumeration.values()) //enumeration.values() is a built in array
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		
		//bisa atur mulai darimana sampe mana
		System.out.println("\nAnd now for the range of constants!\n");
		for (enumeration people: EnumSet.range(enumeration.kelsey, enumeration.candy)){
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
		
		//statics
		statics stat1 = new statics("Megan","Fox");
		statics stat2 = new statics("Natalie","Portman");
		statics stat3 = new statics("Taylor","Swift");
		
		System.out.println();
		System.out.println(stat1.getFirst());
		System.out.println(stat1.getLast());
		System.out.println(stat1.getMembers());
		
		//finals
		finals finalObject = new finals(10);
		
		for(int i=0;i<5;i++){
			finalObject.add();
			System.out.printf("%s ", finalObject);
		}
		
		//inheritance
		inheritance inh = new inheritance();
		inh.eat(); //see? ini ngambil method dari foodInherit
		
	}

}
