import java.lang.*;
import java.util.*;
class Armstrong{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n:");
		n=sc.nextInt();
		int rem,count=0;
		double sum=0;
		int num=n;
		int orinum=n;
		while(n>0){
			n=n/10;
			count=count+1;
		}
		while(num>0){
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(orinum==sum)
			System.out.println(orinum+" is an armstrong number");
		else
			System.out.println(orinum+ "is not an armstrong number");
	}
}
		