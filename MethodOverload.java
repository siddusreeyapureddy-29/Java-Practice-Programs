class Sum{
	int addition(int a){
		return(a+2);
	}
	int addition(int a,int b){
		return(a+b);
	}
	int addition(int a,int b,int c){
		return(a+b+c);
	}
	float addition(float a,float b,float c,float d){
		return(a+b+c+d);
	}
	float addition(float a,float b,float c,float d,float e){
		return(a+b+c+d+e);
	}
}
class MethodOverload{
	public static void main(String args[]){
		Sum s=new Sum();
		int add;
		add=s.addition(2);
		System.out.println("calling addition from single argument sum method="+add);
		add=s.addition(2,5);
		System.out.println("from two argument sum method=" +add);
		add=s.addition(2,5,7);
		System.out.println("from three argument sum method="+add);
		float addf;
		addf=s.addition(2.5f,5.7f,7.8f,9.7f);
		System.out.println("from four argument sum method="+addf);
		addf=s.addition(2.5f,5.7f,7.8f,2f,5f);
		System.out.println("from five argument sum method="+addf);
	}
}