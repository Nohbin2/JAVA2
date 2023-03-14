import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		
		for(int i = 0; i < n; i++)
		System.out.println(s);
	}
}
