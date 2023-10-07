package Assignment;

public class Assignment_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i,j;
          int n=5;
          int ch=65;
          for(i=1;i<=n;i++) {
        	  for(j=i;j<=n-i;j++) {
        		  System.out.print((char)(ch + j)+" ");
        	  }
        	  System.out.println();
          }
	}

}
