import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		
		int n1,i,res;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		n1=s.nextInt();
		for(i=1;i<=10;i++) {
			res=n1*i;
			System.out.println(n1+" * "+i+" = "+res );	
		}
		
	}
	
}
