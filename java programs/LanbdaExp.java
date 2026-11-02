interface A{
	void show();
}
class LambdaExp{
	public static void main(String args[]){
		A obj->System.out.println("in a shhow");
			
		obj.show();
	}
}
