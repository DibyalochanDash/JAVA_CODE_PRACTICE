package Number_Pattern;

import java.util.Scanner;

public class New17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
        int i,j,k;
         for(i=1;i<=n;i++) {
        	 int count=1;
        	 for(k=1;k<=n-i;k++) {
        		 System.out.print("  ");
        	 }
        	 for(j=1;j<=2*i-1;j++) {
        		 if((i==1 || i==n ||   j==(2*i)-1)){
        		 if(j<i)  
        		 {
        			 System.out.print(count++ + " ");
        		 }else {
        			 System.out.print(count-- + " ");
        		 }
        	 }
        	 }
        	 System.out.println();
         }
	}

}
