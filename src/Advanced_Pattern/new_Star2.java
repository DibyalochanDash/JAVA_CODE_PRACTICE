package Advanced_Pattern;

public class new_Star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j,k;
        int count =1;
        int n=5;
        
        for(i=1;i<=n;i++) {
        	for(k=1;k<=n-i;k++) {
        		System.out.print(" ");
        	}
        	for(j=1;j<=i;j++) {
        		if(count<10) {
        			System.out.print("0");
        		}
        		System.out.print(count+" ");
        		count++;
        	}
        	System.out.println();
        }
	}

}
