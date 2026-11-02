import java.util.*;
class AscDesString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n:");
		int n=sc.nextInt();
		String[] str=new String[n];
		System.out.println("enter strings:");
		for(int i=0;i<n;i++){
			str[i]=sc.next();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(str[i].compareTo(str[j])>0){
					String temp;
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("ascending order of strings:");
		for(int i=0;i<n;i++)
			System.out.println(str[i]);
		System.out.println("descending order of strings:");
		for(int i=n-1;i>=0;i--)
			System.out.println(str[i]);
	}
}