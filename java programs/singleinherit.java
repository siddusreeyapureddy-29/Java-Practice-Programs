class Add{
	public int sum(int a,int b){
		int c=a+b;
		return c;
	}
}
class Sub {
	public int sub(int a,int b){
		int c=a-b;
		return c;
	}
}
class Mul extends Sub,Sum{
	public int mul(int a,int b){
		int c=a*b;
		return c;
	}
}
	
class Singleinherit{
	public static void main(String ars[]){
		Mul obj1=new Mul();
		int e=obj1.sum(90,23);
		System.out.println("sum is" +e);
		int f=obj1.sub(90,23);
		System.out.println("sub is" +f);
		int g=obj1.mul(9,3);
		System.out.println("mul is" +g);
	}
}
		
		