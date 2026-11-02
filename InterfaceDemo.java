interface Shapes{
	double pi=3.14;
	double areaCircle(double radius);
	double areaRectangle(double length,double breadth);
}
class RealShapes implements Shapes{
	public double areaCircle(double radius){
		return pi*radius*radius;
	}
	public double areaRectangle(double length,double breadth){
		return length*breadth;
	}
}
class InterfaceDemo{
	public static void main(String args[]){
		Shapes s;
		s=new RealShapes();
		double ac=s.areaCircle(5);
		System.out.println("Area of circle:"+ac);
		double ar=s.areaRectangle(9,5);
		System.out.println("Area of traingle:"+ar);
		System.out.println("value of pi:"+Shapes.pi);
	}
}
	