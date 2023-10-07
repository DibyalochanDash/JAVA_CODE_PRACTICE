package Assignment;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i,j,k;
      int n=5;
      for(i=1;i<=n;i++) {
    	  for(k=1;k<=n-i;k++) {
    		  System.out.print("  ");
    	  }
    	  int count=1;
    	  for(j=1;j<=2*i-1;j++) {
    		  if(j<i) {
    		  System.out.print(count++ +" ");
    	  }else {
    		  System.out.print(count--  +" ");}
    	  }
    	  System.out.println();
      }
	}

}
