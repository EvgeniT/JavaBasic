import java.util.Scanner;

public class TheSmallestOfThreeNumbers {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double smallest = Math.min(a, Math.min(b, c));
		System.out.println(smallest);
	}
}
