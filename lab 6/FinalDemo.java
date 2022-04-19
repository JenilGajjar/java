class  A{
	public final int a=10;
}
class B extends A{
	public void method()
	{
		a=20;
	}
}
public class FinalDemo{
	public static void main(String[] args) {
		A aobj = new A();
		System.out.println(aobj);  
	}
}