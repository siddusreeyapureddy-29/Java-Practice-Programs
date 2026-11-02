import p1.Arithmetic;
class PackageDemo{
	public static void main(String args[]){
		Arithmetic ar=new Arithmetic();
		System.out.println("ivoke Arithematic class methods from package p1");
		double a=ar.addition(6.7,8.9);
		System.out.println("Addition="+a);
		double s=ar.subtraction(9.0,7.3);
		System.out.println("Substraction="+s);
		double m=ar.multiplication(9.8,2.0);
		System.out.println("Multiplication="+m);
		double d=ar.division(8.9,4.3);
		System.out.println("Division="+d);
	}
}