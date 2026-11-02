class Sample{
	static int x=90;
	static{
		System.out.println("static is created");
	}
	static void sum(){
		System.out.println("Static method is created");
	}
}
class Sample1{
	public static void main(String args[]){
		int b=Sample.x;
		System.out.println(b);
		Sample.sum();
		
	}
}
		
