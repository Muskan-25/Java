import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		int n1,n2,i;
		float res;
		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter n1 : ");
		n1=s.nextInt();
		System.out.print("Enter n2 : ");
		n2=s.nextInt();
		
		System.out.println("Choose Any One : ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. division");
		
		i= s.nextInt();
		if(i==1) {
			res= n1+n2;
			System.out.println("Result : "+res);
		}
		else if(i==2) {
			res= n1-n2;
			System.out.println("Result : "+res);
		}
		else if(i==3) {
			res= n1*n2;
			System.out.println("Result : "+res);
		}
		else if(i==4) {
			res= n1/n2;
			System.out.println("Result : "+res);
		}
		else {
			System.out.println("Wrong input !!!");
			System.out.println("Please Try Again");
		}
		
	}
	
}
