class Person{
	public void display(){
		System.out.println("i am an indian");
	}
}
class Programmer extends Person{
	public void display(){
		System.out.println("i am computer programmer");
	}
}
class Engineer extends Programmer{
	public void display(){
		System.out.println("i am an software engineer");
	}
}
class MethodOverride{
	public static void main(String args[]){
		Person p;
		p=new Person();
		p.display();
	    p=new Programmer();
		p.display();
		p=new Engineer();
		p.display();
	}
}
	