package Advanced_Pattern;

public class new_Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int i,j;
		int n=5;
		for(i=1;i<=n;i++) { 
			int count=i*(i+1)/2;
			for(j=1;j<=i;j++) {
//				if(count<10) {
//					System.out.print("0");
//				}
				System.out.print(count-j+1+"  ");
				if(j<=i-1) {
				System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}

}
