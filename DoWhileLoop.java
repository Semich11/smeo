import java.util.Scanner;

public class DoWhileLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int number1 = 0;
		int number2 = 0;

		boolean RunOperationAgain = false;


		do{	
			System.out.print("Enter first number: ");
			number1 = input.nextInt();

			System.out.print("Enter second number: ");
			number2 = input.nextInt();

			System.out.println(number1 + number2);

			System.out.print("If you want to perform the operation again type true or type false to quit: ");
			RunOperationAgain = input.nextBoolean(); 


		}while (RunOperationAgain);
	}
}