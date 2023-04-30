import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		int a ,b,c;
		System.out.println("Enter your number?");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt(); // input your int type number 
		b=scanner.nextInt();
		c=a+b;
		System.out.println("Add="+c);
		c=a-b;
		System.out.println("Sub="+c);
	}

	
}
