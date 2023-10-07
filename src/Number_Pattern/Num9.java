package Number_Pattern;

import java.util.Scanner;

public class Num9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
        int i,j,k;
        
        for(i=1;i<=n;i++) {
        	for(j=1;j<=(n+1)-i;j++) {
        		//System.out.print(j);
        		System.out.print(i);
        	}
        	System.out.println();
        }
	}

}
