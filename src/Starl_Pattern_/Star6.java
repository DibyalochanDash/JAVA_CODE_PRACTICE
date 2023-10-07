package Starl_Pattern_;

import java.util.Scanner;

// hollow right angle triangle

public class Star6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
        
        int i,j;
        for(i=1;i<=n;i++) {
        	for(j=1;j<=i;j++) {
        		
        		if(i==1 || i==n || j==1 || j==i) {
        		System.out.print("*");
        	}else {
        		System.out.print(" ");
        	}
        	}
        		System.out.println();
        }
	}

}
	
