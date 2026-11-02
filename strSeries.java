import java.util.*;
class StrSeries{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int rem,fact;
		    int sum=0;
		    int num=i;
			int num1=num;
			while(num>0){
				rem=num%10;
				fact=1;
				for(int j=1;j<=rem;j++){
					fact=fact*j;
				} 
				sum=sum+fact;
				num=num/10;
			}
			if(sum==num1){
				System.out.println(num1);
			}
		}
	}
}
					
				
		