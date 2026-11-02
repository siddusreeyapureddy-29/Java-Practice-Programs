 class Demo{
	 Demo{
		 System.out.println("default constructor is called");
	 }
	 Demo{
		 int add(int a,int b){
		 int c=a+b;
		 System.out.println("the sum is:" +c);
		 return c;
	 }
 }
 class Demo1 extends Demo{
	 Demo1{
		 System.out.println("default constructor of Demo1 is called");
	 }
	 Demo1{
		 int add(int a,int b){
			 int c=a+b;
		     System.out.println("the sum is:" +c);
			 return c;
	 }
 }
 class Super1{
	 public static void main(String args[]){
		 Demo1 obj=new Demo1();
		 System.out.println("the sum is:" +obj.add(78,54));
	 }
 }
		 
		 
		 
		 
		 
		 