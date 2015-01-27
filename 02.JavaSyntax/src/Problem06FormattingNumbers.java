import java.util.Scanner;

public class Problem06FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		String hex = Integer.toHexString(a);
		//|%-10X|
		String binary = Integer.toBinaryString(a);
		
		System.out.printf("|%-10S|%010d|%10.2f|%-10.3f|",hex,Integer.parseInt(binary),b,c);
	}

}
