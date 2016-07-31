
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
	//or use this alternatives (to loop through all the array values)
	public void enhancedLoop(){
		int buckys[] = {3,4,5,6,7};
		int total = 0;
		
		for(int x: buckys){
			total += x;
		}
		
		System.out.println(total);
	}
	
	//arrays in methods
	public void arrayMethod(){
		int buckys[] = {3,4,5,6,7};
		change (buckys);
	}
	
	public static void change(int x[]){
		for(int counter=0; counter<x.length; counter++){
			x[counter] += 5;
		}
	}
}
