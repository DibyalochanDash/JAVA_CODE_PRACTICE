package Assignment;

public class Assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,j,k;
       int n=5;
       for(i=1;i<=n;i++) {
    	   for(k=1;k<=n-i;k++) {
    	   System.out.print(" ");
    	   }
    	   for(j=1;j<=i;j++) {
    		   System.out.print(i+" ");
    	   }
    	   System.out.println();
       }
       for(i=1;i<=n-1;i++) {
    	   for(k=1;k<=i;k++) {
    		   System.out.print(" ");
    	   }
    	   for(j=i;j<=n-1;j++) {
    		   System.out.print(n-i+" ");
    	   }
    	   System.out.println();
       }
	}

}
