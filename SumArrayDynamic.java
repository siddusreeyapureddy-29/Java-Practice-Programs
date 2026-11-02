import java.util.*;
class SumArrayDynamic{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements to store in an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("read array elemnts");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+a[i];
		}
		System.out.println("array elemts are:");
		for(int i=0;i<n;i++){
			System.out.println("a["+i+"]:" +a[i]);
		}
		System.out.println("the sum of elements in an array is:" +sum);
	}
}