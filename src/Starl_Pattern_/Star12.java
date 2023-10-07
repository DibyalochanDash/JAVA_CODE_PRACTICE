package Starl_Pattern_;

import java.util.Scanner;

public class Star12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
        int i,j,k;
         
        for(i=1;i<=n;i++) {
        	for(j=1;j<=(n+1)-i;j++) {
        		
        		if(i==1 || i==n || j==1
        				||j==(n+1)-i) {
        			
        			System.out.print("*");
        		}else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
	}

}
