import java.util.Random;

public class rng {
	public void randoms(){
		Random dice = new Random();
		int number;
		
		for(int i=1; i<=10; i++){
			number = dice.nextInt(6);
			System.out.println(number + " ");
		}
	}
}
