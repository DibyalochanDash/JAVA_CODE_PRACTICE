package Starl_Pattern_;

import java.util.Scanner;

public class Star14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++) {
        	for(j=1;j<=(2*i)-1;j++) {
        		System.out.print("*"+" ");
        	}
        	System.out.println();
        }
	}

}
