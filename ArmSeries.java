import java.lang.*;
import java.util.*;
class ArmSeries{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int range=sc.nextInt();
		for(int i=0;i<=range;i++){
			int rem;
			int temp=0;
			int num=i;
			int n=num;
			while(n>0){
				rem=n%10;
				temp=temp+rem*rem*rem;
				n=n/10;
			}
		if(temp==num)
			System.out.println(num);
		}
	}
}
		
		