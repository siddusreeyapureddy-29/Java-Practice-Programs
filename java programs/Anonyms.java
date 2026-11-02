class A{
	public void show(){
		System.out.println("in A show");
	}
}
public class Anonyms{
	public static void main(String args[]){
		A obj=new A(){
		public void show(){
		System.out.println("in A show");}
		};
		obj.show();
	}
}