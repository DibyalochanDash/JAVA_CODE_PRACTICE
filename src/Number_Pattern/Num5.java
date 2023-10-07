package Number_Pattern;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
        
        int i,j,k;
        for(i=1;i<=n;i++) {
        	for(k=1;k<=n-i;k++) {
        		System.out.print(" ");

        	}
        	for(j=1;j<=i;j++) {
        		
        	
        	//System.out.print(j);
        	System.out.print(i);
        	}
        	System.out.println();
        }
	}

}
