import java.lang.*;
import java.util.*;
class DataTypes{
	public static void main(String args[]){
		Scanner sin=new Scanner(System.in);
		int i;
		System.out.println("enter i for integer");
		i=sin.nextInt();
		float f;
		System.out.println("enter f for float:");
		f=sin.nextFloat();
		char c;
		System.out.println("enter c for character:");
		c=sin.next().charAt(0);
		long l;
		System.out.println("enter l for long:");
		l=sin.nextLong();
		short s;
		System.out.println("enter s for short:");
		s=sin.nextShort();
		byte b;
		System.out.println("enter b for byte:");
		b=sin.nextByte();
		boolean b1;
		System.out.println("enter b1 for boolean:");
		b1=sin.nextBoolean();
		System.out.println("Int i:" +i);
		System.out.println("Float f:" +f);
		System.out.println("Character c:" +c);
		System.out.println("Long l:" +l);
		System.out.println("Short s:" +s);
		System.out.println("Byte b:" +b);
		System.out.println("Boolean b1:" +b1);
	}
}
