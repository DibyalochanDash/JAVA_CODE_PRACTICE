package Assignment;

public class Assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i,j;
          int n=5;
          for(i=1;i<=n;i++) {
        	  for(j=1;j<=n;j++) {
        		  if(j<=i) {
        		  System.out.print(j);
        	  }else {
        		  System.out.print(1);
        		  }
        	  }
        	  System.out.println();
          }
	}

}
