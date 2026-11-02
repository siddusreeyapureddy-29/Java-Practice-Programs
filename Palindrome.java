import java.lang.*;
import java.util.*;
class Palindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rev=0;
		int num=n;
		int rem;
		while(n>0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==num)
			System.out.println(num+ "is a palindrome");
        else
            System.out.println(num+ "is not a palindrome");
	}
}	