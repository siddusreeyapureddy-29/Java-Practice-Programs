abstract class Cal{ 
	void add(){
		System.out.println("the add function is possible ");
	}
	abstract void sub();
}
abstract class AdvCal extends Cal{
	 void mul(){
		System.out.println("the mul is possible");
	}
}
class AdvCal1 extends AdvCal{
	 void sub(){
		System.out.println("the sub is possible");
	 }
}

class Abstract1{
	public static void main(String args[]){
		AdvCal1 a=new AdvCal1();
		a.add();
		a.sub();
	}
}