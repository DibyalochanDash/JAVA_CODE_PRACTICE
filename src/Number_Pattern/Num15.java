package Number_Pattern;

import java.util.Scanner;

public class Num15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++) {
//        	for(j=1;j<=n+1-i;j++) {
//        		System.out.print(j +" ");
//        	}
        	for(j=1;j<=n+1-i;j++) {
        		System.out.print(i+j-1 +" ");
        	}
        	System.out.println();
        }
	}

}
