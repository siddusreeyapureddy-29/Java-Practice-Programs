class Home{
	void add(){
		System.out.println("program is created");
	}
	int insert(int a,int b){
		System.out.println("int is created");
		int c=a+b;
		System.out.println("value of c is:" +c);
	}
}
class Create{
	public static void main(String args[]){
		Home h1=new Home();
		h1.add();
		h1.insert(67,90);
		System,out,println("the program is complte");
	}
}