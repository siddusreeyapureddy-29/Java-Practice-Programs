import java.util.*;
class SumMatrix{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows and colums:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("enter matrix elements:");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				sum=sum+a[i][j];
			}
		}
		System.out.println("matrix elements are:");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.println(a[i][j]+"\t");
			}
		System.out.println();
		}
		System.out.println("sum of elements in a matrix:" +sum);
	}
}