package Number_Pattern;

import java.util.Scanner;

public class Num1 {
  
	//Number print
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
		int i ,j;
		int count=1;
           
           for(i=1;i<=n;i++) {
        	   for( j=1;j<=n;j++) {
        		  if(count<10) {
                         System.out.print("0");        			  
        		  }
        		   System.out.print(count+" ");
        		   count++;
        	   }
        	   System.out.println();
	}

}
}