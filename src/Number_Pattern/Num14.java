package Number_Pattern;

import java.util.Scanner;

public class Num14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
        int i,j;
       
        for(i=1;i<=n;i++) {
        	 int count=1;
        	for(j=1;j<=(2*i)-1;j++) {
        		if(j<i) {
        			System.out.print(count++ +" ");
        		}else {
        			System.out.print(count-- +" ");
        		}
        	}
        	System.out.println();
        }
	}

}
