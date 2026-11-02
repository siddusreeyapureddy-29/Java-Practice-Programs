class A{
	public void show(){
		System.out.println("in A show");
	}
}
final class B extends A{
	public void show(){
		System.out.println("in B show"); 
	}
}
class Finkey{
	public static void main(String args[]){
		B obj=new B();
		obj.show();
	}
}
