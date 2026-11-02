import java.util.*;
class Triangle{
	double base,height;
	Triangle(){
		System.out.println("from default constructor");
		base=3.7;
		height=5.9;
	}
	Triangle(double dim){
		System.out.println("from one parameterised constructor");
		base=height=dim;
	}
	Triangle(double b,double h){
		System.out.println("from two arguments constructor");
		base=b;
		height=h;
	}
	Triangle(Triangle tob){
		System.out.println("from copy constructor,triangle,object created from another triangle object");
		base=tob.base;
		height=tob.height;
	}
	void displayDimensions(){
		System.out.println("triangle base:" +base);
		System.out.println("triangle height:" +height);
	}
	double area(){
		double ar=0.5*base*height;
		return ar;
	}
}
class ConstructorOverload{
	public static void main(String args[]){
		Triangle td=new Triangle();
		td.displayDimensions();
		System.out.println("area from default constructor:"+td.area());
		Triangle to=new Triangle(5.7);
		to.displayDimensions();
		System.out.println("area from single argument constructor:"+to.area());
		Triangle tt=new Triangle(5.7,9.8);
		tt.displayDimensions();
		System.out.println("area from two argument constructor:"+tt.area());
		Triangle tc=new Triangle(to);
		tc.displayDimensions();
		System.out.println("area from copy constructor:"+tc.area());
	}
}
		