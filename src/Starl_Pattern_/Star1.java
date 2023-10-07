package Starl_Pattern_;
  // hollow space star
public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int k;
        //int k2;
        int n=15,i,j ;
        for ( i=1; i<=n; i++) {
        	for ( j= 1; j<=n; j++) {
        		
			   if (i == 1 || i==n || j == 1 ||j == n ) {
        		    System.out.print("*"+" ");
				}else {
        	              System.out.print("  ");
			
	              	}
        	}
        	System.out.println();
          }
       }
	
	}

                                                             



      