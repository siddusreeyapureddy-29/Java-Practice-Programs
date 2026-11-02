import java.util.*;
class Division{
	public static void main(String args[]){
		Scanner sin=new Scanner(System.in);
		int a,b;
		System.out.println("enter a:");
		a=sin.nextInt();
		System.out.println("enter b:");
		b=sin.nextInt();
		double c=(double)a/b;
		System.out.println("Division of "+a+" and "+b+" is "+c);
	}
}