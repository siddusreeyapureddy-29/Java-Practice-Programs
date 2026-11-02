class Demo{
	int d=90;
	void print(){
		System.out.println("the int method is called");
	}
}
class Demo1 extends Demo{
	int d=56;
	void display(){
	System.out.println("the number is:" +super.d);
	}
}
class Super1{
	public static void main(String args[]){
	Demo1 obj1=new Demo1();
	obj1.print();
	obj1.display();
    System.out.println(obj1.d);
	}
}	
	