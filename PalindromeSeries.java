import java.lang.*;
import java.util.*;
class PalindromeSeries{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int range1=sc.nextInt();
		int range2=sc.nextInt();
		for(int i=range1;i<=range2;i++){
			int rev=0;
			int rem;
			int num=i;
			int n=num;
			while(n>0){
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
				}
			if(rev==num)
				System.out.println(num);
		}
	}
}