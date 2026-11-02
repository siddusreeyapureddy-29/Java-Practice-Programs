class Siddu{
	Siddu(){
		System.out.println("default constructorr");
	}
	Siddu(int a,int b){
		System.out.println(a+b);
		System.out.println("parameterized constructorr");
	}
}
class Chandra{
	public static void main(String args[]){
		Siddu sid=new Siddu();
		Siddu sid1=new Siddu(34,90);
	}
}


