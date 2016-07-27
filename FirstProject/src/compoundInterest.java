
public class compoundInterest {

	public void ahoy() {
		double amount;
		double principal = 10000;
		double rate = .01;
		
		for(int day = 1; day<=20; day++){
			amount = principal * Math.pow(1 + rate, day);
			System.out.println(day + " " + amount);
		}
		
	}
	public void ahoyy(){
		double amount;
		double principal = 10000;
		
		for (int i = 1; i<=20; i++){
		principal = principal + ((principal*1)/100);
		System.out.println(i + "  " + principal);
		}
		}
}
