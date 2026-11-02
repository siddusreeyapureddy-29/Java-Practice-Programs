abstract class Cal{
	void add(){
		System.out.println("the add function is possible ");
	}
	abstract void sub();
}
class AdvCal extends Cal{
	public void sub(){
		System.out.println("the sub is possible");
	}
}
class Abstract1{
	public static void main(String args[]){
		AdvCal a=new AdvCal();
		a.add();
		a.sub();
	}
}