import java.util.*;
class MatrixMul{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows and colums for A matrix");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int a[][]=new int[r1][c1];
		System.out.println("enter elements for matrix A:");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix A:");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
		     System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("enter no of rows and colums for B matrix");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int b[][]=new int[r2][c2];
		System.out.println("enter elements for matrix B:");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix B:");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		if(c1==r2){
			int c[][]=new int[r1][c2];
			for(int i=0;i<r1;i++){
						for(int j=0;j<c2;j++){
							c[i][j]=0;
							for(int k=0;k<c1;k++){
								c[i][j]=a[i][k]*b[k][j];
							}
						}
			}
			System.out.println("Resultant matrix:");
			for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("matrix is not possible");
		}
	}
}

			
