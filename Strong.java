import java.util.*;
class Strong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int rem,fact;
		int num=n;
		int sum=0;
		while(n>0){
			rem=n%10;
			fact=1;//factorial calculation inside the class
			for(int i=1;i<=rem;i++){
				fact =fact*i;
			}
			sum+=fact;//add the factorial to the sum
			n=n/10;//remove the last digit and update the number
		}
		if(sum==num)
			System.out.println(num+" is a Strong number");
		else
			System.out.println(num+" is not a Strong number");
	}
}
		