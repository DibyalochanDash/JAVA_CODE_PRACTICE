package Advanced_Pattern;

public class newStar5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int i,j;
		int n=5;
		for(i=1;i<=n;i++) {
			char ch='A';
			for(j=1;j<=i;j++) {
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
	}

}
