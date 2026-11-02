class Demo{
	String c;
	Demo(String a,String b){
		c=a+b;
	}
}
class Parameterisedcon{
	public static void main(String args[]){
		Demo obj=new Demo("siddu","sai");
		String num=obj.c;
		System.out.println("the sum is:"+num);
	}
}
		
