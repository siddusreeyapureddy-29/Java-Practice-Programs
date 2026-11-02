class Cal{
	public int add(int n1,int n2){
		return n1+n2;
	}
}
class AdvCal extends Cal{
	public int add(int n1,int n2){
		return n1*n2;
	}
}
class Override{
	public static void main(String args[]){
		AdvCal obj=new AdvCal();
		int num=obj.add(9,6);
		System.out.println(num);
	}
}