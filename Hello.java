class Sample{
	static int a=10;
	static int add(int a,int b){
		int c=a+b;
		return c;
	}
}
class Hello{
	public static void main(String args[]){
		System.out.println(Sample.a);
		System.out.println("The sum is:" +Sample.add(90,87));
	}
}
		
		