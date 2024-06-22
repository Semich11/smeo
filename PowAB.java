import java.util.Scanner;

public class PowAB{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);


		System.out.print("Number A: ");
		int numberA = input.nextInt();

		System.out.print("number B: ");
		int numberB = input.nextInt();


		double power = Math.pow(numberA, numberB);

		System.out.println("a, b, pow(a, b)");
		System.out.printf("%d, %d, %d", numberA, numberB, (int)power);

	}
}