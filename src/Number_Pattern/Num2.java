package Number_Pattern;

import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int count =1;
        int i,j;
        for ( i = 1; i<=n; i++) {
			for( j= 1;j<=n;j++) {
				
				
				System.out.print((i+j-1)+" ");
				
			}
			System.out.println();
		}
	}

}
