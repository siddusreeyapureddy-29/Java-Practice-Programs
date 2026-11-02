interface A{
	int add(int i,int j);
}
class LambdaExp{
	public static void main(String args[]){
		A obj=new A(){
			public int add(int i,int j){
				return i+j;
			}
		};
		int result=obj.add(89,67);
		System.out.println(result);

	}
}
