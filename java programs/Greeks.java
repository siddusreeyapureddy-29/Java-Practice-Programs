class Siddu{
	Siddu(int a,int b){
		System.out.println("constructor called");
		int c=a+b;
		System.out.println("the sum="+c);
	}
	Siddu(){
	}
}
class Greeks{
	public static void main(String args[]){
		Siddu sid=new Siddu(56,200);
		Siddu sidd=new Siddu();
	}
}