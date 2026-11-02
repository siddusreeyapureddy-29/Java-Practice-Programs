import java.util.*;
class SumForEach{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows and columns:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("enter elements into array");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int x[]:a){
			for(int y:x){
				sum=sum+y;
			}
		}
		System.out.println("the sum of elements in an array:" +sum);
	}
}
		