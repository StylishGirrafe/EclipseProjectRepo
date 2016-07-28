import java.util.*;
import java.io.*;

public class testLoop {

	    public void ayo(){
	        int x = 0;
	        System.out.println("ini mulai testLoop ya");
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            x=x+a;
	            for(int j=0; j<n; j++){
	                x=x+(int)(Math.pow(2,j)*b);
	                System.out.print(x+" ");
	            }
	            x=0;
	            System.out.println();
	        }
	        in.close();
	    }

}
