import java.util.Scanner;

public class addnumbers {

	public static void main(String[] args) {
		
		int n1,n2,res;
		
		Scanner s = new Scanner(System.in);

		System.out.print("Enter First Number : ");
		n1=s.nextInt();
		System.out.print("Enter Second Number : ");
		n2=s.nextInt();
		
		res=n1+n2;
		System.out.println("Result is : "+res);
	}
	
}
