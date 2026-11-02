import java.util.*;
class SumCountDigits{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		int rem;
		while(n>0){
			rem=n%10;
			sum=sum+rem;
			count=count+1;
			n=n/10;
		}
		System.out.println("Sum of digits: "+sum);
		System.out.println("No.of digits: "+count);
	}
}