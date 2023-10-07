package Assignment;

public class Assignment_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int i,j,k;
		int n=5;
		for(i=n;i>=1;i--) {
			for(k=1;k<=i-1;k++) {
				System.out.print("  ");
			}
			for(j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
