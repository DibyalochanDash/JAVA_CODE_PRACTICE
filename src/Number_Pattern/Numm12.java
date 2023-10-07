package Number_Pattern;

import java.util.Scanner;

public class Numm12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
         int i,j;
         for(i=0;i<=n;i++) {
        	 for(j=0;j<n-i;j++) {
        		 System.out.print(j+1+" ");
        	 }
        	 System.out.println();
         }
	}

}
