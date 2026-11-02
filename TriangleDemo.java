class Triangle{
	private int base=50;
	public int height=70;
	public double getArea(){
		double area;
		area=0.5*base*height;
		return area;
	}
}
class TriangleDemo{
	public static void main(String args[]){
		Triangle tr=new Triangle();
		double ar=tr.getArea();
		System.out.println("Area of fixed size triangle:" +ar);
		System.out.println("height of fixed size triangle:" +tr.height);
		//System.out.println("base of fixed size triangle:" +tr.base);
	}
}
		
