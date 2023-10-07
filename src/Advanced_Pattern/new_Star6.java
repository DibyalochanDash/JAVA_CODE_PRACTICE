package Advanced_Pattern;

public class new_Star6 {
   
	public static void main(String[] args) {
		
		int i,j,n=5;
		char ch='A';
		for(i=1;i<=n;i++) {
			if(i % 2==0) {
				char chRev=(char)(ch+i-1);
				for(j=1;j<=i;j++) {
					System.out.print(chRev-- +" ");
					ch++;
				}
			}else {
				for(j=1;j<=i;j++) {
					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}
	}


	
}
