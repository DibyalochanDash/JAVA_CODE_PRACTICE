package Advanced_Pattern;

import java.util.Scanner;

public class new_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++) {
			if(i % 2 == 0) {
				System.out.print(i+1+" ");
			}
			
			for(j=1;j<=n;j++) {
				System.out.print(i+" ");
			}
			if(i % 2!= 0) {
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
	}

}
