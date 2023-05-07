import java.util.Scanner;

public class AvergaeTest {

	public static void main(String[] args) { 
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your marks");
	int a=scanner.nextInt();  // convert to int
	int b=scanner.nextInt();
	int c=scanner.nextInt();

	float avg=(a+b+c)/3;
	System.out.println("Average="+avg);
	if(avg>=60)
	{
		System.out.println("First ");
	}

	else if(avg>=45 && avg<=59)
	{
		System.out.println("Second ");
	}
	else
	{
		System.out.println("Fail ");
	}
	

	}

}
