import java.util.*;
class Addition{
	public static void main(String args[]){
		Scanner sin=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a:");
		a=sin.nextInt();
		System.out.println("enter b:");
		b=sin.nextInt();
		c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c );
	}
}