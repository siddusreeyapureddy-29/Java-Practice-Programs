class Sample{
	static int a=10;
	static{
		System.out.println("static block is created");
	}
	static void add(){
		System.out.println("Static method is created");
	}
}
class StaticMethod{
	public static void main(String args[]){
		System.out.println(Sample.a);
		Sample.add();
	}
}