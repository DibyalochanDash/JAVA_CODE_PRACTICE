package Assignment;

public class Assignment_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int i,j;
		int n=5;
		for(i=1;i<=n;i++) {
			int num = i%2==0? 0:1;
			System.out.print(num);
			for(j=1;j<n;j++) {
				if(num==1) {
					num=0;
					//System.out.print(num);
				}else {
					num=1;
					//System.out.print(num);
				}
				System.out.print(num);
			}
			System.out.println();
		}
	}

}
