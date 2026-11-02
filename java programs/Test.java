
import java.util.Scanner;

public class Test{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.nextLine().charAt(0);
		if (c >= 'a' && c <= 'z') {
			System.out.println(c + "is a lowercase letter");
		} else {
			System.out.println(c + "is not a lower case letter");
		}
		sc.close();
	}

}
