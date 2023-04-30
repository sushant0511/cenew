
class TestSecond
{
	public TestSecond() {
		System.out.println("Hi from Constructor body");
	}
		public void show() // memory is not allocated to this method
	{
		System.out.println("Hi From Second ");
	}
}
public class TestObject {

	public static void main(String[] args) {
		
		System.out.println("Hi From main block");
		//classname objectname =new classname()
		  TestSecond second=     new TestSecond();
		// second is object here 
		  second.show();
	}

}
