import java.lang.*;
import java.util.*;
class EvenOddNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter a:");
		a=sc.nextInt();
		if(a%2==0){
			System.out.println("It is an even number");
		}
		else{
			System.out.println("It is an odd number");
		}
	}
}
		