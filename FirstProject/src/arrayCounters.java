import java.util.Random;
public class arrayCounters {
	public void arrayCount(){
		Random rand = new Random();
		int freq[] = new int[7];
		
		System.out.println("This is freq 5:"+freq[5]);
		
		for(int roll = 1; roll < 1000; roll++){
			++freq[1+rand.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		
		for(int face=1; face<freq.length; face++){
			System.out.println(face+"\t"+freq[face]);
		}
	}
}
