class Sample{
	void add(){
		System.out.println("sidduuuuuu");
	}
	int add1(int a,int b){
		int c=a+b;
		return c;
	}
}
class Abcde{
	public static void main(String args[]){
		Sample obj=new Sample();
		obj.add();
		int d=obj.add1(56,89);
		System.out.println(d);
	}
}
		