// Create a class named ThreeDPoint to model a point in a three-dimensional space. Let
// ThreeDPoint be derived from MyPoint with following additional features:
// - A data fields named z that represents the z-coordinate.
// - A no-arg constructor that creates a point (0, 0, 0).
// - A constructor that constructs a point with three specified coordinates.
// - A get method that returns the z value.
// - Override the distance method to return the distance between two points in the
// three-dimensional space.
// - Write a program that creates two points (0, 0, 0) and (10, 30, 25.5) and display the
// distance between the two points.
class ThreeDPoint{
	double x,y,z;


	public ThreeDPoint(){
		x=0;
		y=0;
		z=0;
	}
	public ThreeDPoint(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public double distance(ThreeDPoint p){
		return Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2)+Math.pow(p.z-this.z,2));
	}
	public double distance(double x,double y,double z)
	{
		return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)+Math.pow(z-this.z,2));
	}
}
public class ThreeDPointDemo{
	public static void main(String[] args)
	{
		ThreeDPoint p1 = new ThreeDPoint();
		ThreeDPoint p2 = new ThreeDPoint(10,30,25.5);
		System.out.println("distance between two points p2 and p2 is "+ p2.distance(p1));
	}
}