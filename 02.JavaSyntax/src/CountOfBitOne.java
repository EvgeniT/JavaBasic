import java.util.Scanner;

public class CountOfBitOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextInt();
		//binary presentation
		System.out.printf("%016d %n",Long.parseLong(Long.toBinaryString(n)));
		//sum of all 1
		System.out.println(Long.bitCount(n));
	}
}
