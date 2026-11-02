import java.util.*;
class PrimeSeries{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range:");
		int n=sc.nextInt();
		int num,count;
		for(int i=2;i<=n;i++){
			num=i;
			count=0;
			for(int j=1;j<=num;j++){
				if(num%j==0)
					count=count+1;
			}
			if(count==2)
				System.out.println(num);
		}
	}
}
		