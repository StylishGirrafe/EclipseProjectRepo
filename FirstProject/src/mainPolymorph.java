
public class mainPolymorph {

	public static void main(String[] args) {
		
		//polymorphism (lesson 55)
		/*food bucky[] = new food[2];
		bucky[0] = new rice();
		bucky[1] = new cake();
		
		//saves trouble for making a lot of objects
		for(int x=0;x<2;++x){
			bucky[x].eat();
		}*/
		
		//polymorphic (lesson 56)
		fatty bucky = new fatty();
		food fo = new food();
		//subclass of food
		food po = new cake();
		
		
		bucky.digest(fo); //will show "this food is great"
		bucky.digest(po); //can also take cake class
		
	}

}
