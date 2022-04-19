class Animal{
	public void sound()
	{
		System.out.print("Animal sound : ");
	}
}
class Dog extends Animal{
	public void sound()
	{
		super.sound();
		System.out.println("Bark");
	}
}
public class SuperDemo{
	public static void main(String[] args) {
		Dog husky = new Dog();
		husky.sound();
	}
}