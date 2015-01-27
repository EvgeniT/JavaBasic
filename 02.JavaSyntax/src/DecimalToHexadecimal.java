import java.util.Scanner;


public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String hex = Integer.toHexString(num).toUpperCase();
		System.out.println(hex);
	}
}
