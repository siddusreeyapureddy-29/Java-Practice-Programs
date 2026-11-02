class Home{
	void add(){
		System.out.println("program is created");
	}
	int insert(int a,int b){
		System.out.println("int is created");
		int c=a+b;
		return c;
	}
}
class Create{
	public static void main(String args[]){
		Home h1=new Home();
		h1.add();
		h1.insert(67,90);
		int num1=h1.insert(90,34);
		System.out.println("sum of numbers:" +num1);
	}
}