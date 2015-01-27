import java.util.Scanner;
public class TriangleArea {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int Ax = input.nextInt();
		int Ay = input.nextInt();
		
		int Bx = input.nextInt();
		int By = input.nextInt();
		
		int Cx = input.nextInt();
		int Cy = input.nextInt();
		
		double area = 0;
		area = area + Ax*(By-Cy);
		area = area + Bx*(Cy-Ay);
		area = area + Cx*(Ay-By);
		area = area/2.0;
		area = Math.abs(area);
		
		if(area!=0){
			System.out.println((int)area);
		}else{
			System.out.println(0);
		}
	}

}
