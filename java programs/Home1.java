class Siddu{
	void insert(){
		System.out.println("insert is created");
	}
	int add(int a,int b){
		int c=a+b;
		return c;
	}
}
class Home1{
	public static void main(String args[]){
	Siddu sid=new Siddu();
	sid.insert();
	int d=sid.add(45,32);
	System.out.println("the sum is" +d);
	}
}
	
		