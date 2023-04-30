class One
{
	public void show() {
		System.out.println("Hi from Show");
	}
}
class Two
{
	public void display() {
		System.out.println("Hi from display");
	}
}
public class TestObjectCall {

	public static void main(String[] args) {
		One one=new One();
		one.show();
		Two two=new Two();
		two.display();
	}

}
