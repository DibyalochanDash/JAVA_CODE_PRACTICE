package Number_Pattern;

//Hollow right angle triangle 

import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
        
        int i,j;
        for(i=1;i<=n;i++) {
        	for(j=1;j<=i;j++) {
        		if(i==1 || i==n ||j==1 || j==i) {
        			//System.out.print(j);
        			System.out.print(i);
        		}else {
        			System.out.print(" ");
        		}
        		
        	}
        	System.out.println();
        	
        }
	}

}
