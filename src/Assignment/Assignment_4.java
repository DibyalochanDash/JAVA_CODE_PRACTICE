package Assignment;

public class Assignment_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,j,k;
       int n =5;
       for(i=1;i<=n;i++) {
    	   for(k=1;k<=n-i;k++) {
    		   System.out.print(" ");
    	   }
    	   for(j=1;j<=i;j++) {
    		   if(j==1||j==i||i==n-i) {
    		   System.out.print(i+" ");
    	   }else{
    		   System.out.print("  ");
    		   }
    	   }
    	   System.out.println();
       }
       for(i=1;i<=n-1;i++) {
    	   for(k=1;k<=i;k++) {
    		  
    		   System.out.print(" ");
    	   }
    	   for(j=1;j<=n-i;j++) {
    		   if(j==1||j==n-i ) {
    		   System.out.print(n-i+" ");
    	   }else{
    		   System.out.print("  ");
    		   }
    	   }
    	   System.out.println();
       }
	}

}
