class Over{
	float c;
	Over(){
		System.out.println("a");
	}
	Over(float a,float b){
		c=a+b;
	}
	Over(float a,float b,float d){
		c=a-b-d;
	}
}
class Conoverloading{
	public static void main(String args[]){
		Over new1=new Over();
		Over new2=new Over(23.67f,89.32f);
		float num=new2.c;
		System.out.println("the sum is:" +num);
		Over new3=new Over(89.54f,54.87f,78.0f);
		float num1=new3.c;
		System.out.println("the difference is:" +num1);
	}
}
	
		
		