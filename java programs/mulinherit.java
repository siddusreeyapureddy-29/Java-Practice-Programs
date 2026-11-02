class A{
	int c,e;
	int add(int a,int b){
		c=a+b;
		return c;
	}
}
class B extends A{
	int sub(int a,int b){
	    e=a-b;
		return e;
	}
}
class C extends B{
	int d;
	int mul(int a,int b){
		d=a*b;
		return d;
	}
}
class Mulinherit{
	public static void main(String args[]){
		C obj1=new C();
		System.out.println("the sum is:" +obj1.add(67,43));
		System.out.println("the sub is:" +obj1.sub(90,33));
		System.out.println("the mul is:" +obj1.mul(7,3));
	}
}
		