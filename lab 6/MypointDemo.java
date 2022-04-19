// Design a class named MyPoint to represent a point with x and y-coordinates. The class
// contains:
// - The data fields x and y that represent the coordinates with getter methods.
// - A no-arg constructor that creates a point (0, 0).
// - A constructor that constructs a point with specified coordinates.
// - A method named distance that returns the distance from this point to a specified
// point of the MyPoint type.
// - A method named distance that returns the distance from this point to another
// point with specified x- and y-coordinates.
class Mypoint{
	double x,y;

	public Mypoint(){
		x=0;
		y=0;
	}
	public Mypoint(double x,double y){
		this.x=x;
		this.y=y;
	}
	public double distance(Mypoint p){
		return Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2));
	}
	public double distance(double x,double y)
	{
		return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
	}
	
}

public class MypointDemo{
	 public static void main(String[] args) {	
		Mypoint p1 = new Mypoint();
		Mypoint p2 = new Mypoint(3,2);
		Mypoint p3 = new Mypoint(1,4);

		System.out.println(p3.distance(p2));
		System.out.println(p3.distance(3,2));
		}
}


