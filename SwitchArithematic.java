import java.util.*;
class SwitchArithematic{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a,b:");
		a=sin.nextInt();
		b=sin.nextInt();
		double d;
		System.out.println("1-Addition 2-Substraction 3-Multiplication 4-Division 5-Module Divison");
		int op=sin.nextInt();
		switch(op){
			case 1:
			c=a+b;
			System.out.println("addition" +c);
			break;
			case 2:
			c=a-b;
			System.out.println("substraction is" +c);
			break;
			case 3:
			c=a*b;
			System.out.println("multiplication is" +c);
			break;
			case 4:
			d=a/b;
			System.out.println("Division is" +d);
			break;
			case 5:
			c=a%b;
			System.out.println("modulo division is" +c);
			break;
			default:System.out.println("Invalid choice");
		}
	}
}
