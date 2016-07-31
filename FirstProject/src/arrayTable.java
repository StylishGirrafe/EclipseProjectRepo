
public class arrayTable {
	public void arrayTab(){
		System.out.println("Index\tValue");
		int bucky[] = {32,12,18,54,2};
		int sum = 0;
		
		for(int counter = 0; counter<bucky.length; counter++){
			//System.out.println(counter + "\t" + bucky[counter]);
			sum += bucky[counter];
		}
		System.out.println("The sum of this number is: "+ sum);
	}
}
