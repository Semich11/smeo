import java.util.Scanner;

public class TillUserQuit{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int zerosCount = 0;
		int positiveCount = 0;
		int negativeCount = 0;

		System.out.print("Enter a number or -1111 to quit the program: ");
		int userInput = input.nextInt();

		while(userInput != -1111){
			if(userInput == 0){
				zerosCount++;
			}else if(userInput > 0){
				positiveCount++;
			}else{
				negativeCount++;
			}


			System.out.println("Enter a number or -1111 to quit the program: ");
			userInput = input.nextInt();
		}

		System.out.printf("Positive number count is %d%nNegative number count is %d%nZero number count is %d", positiveCount, negativeCount, zerosCount);

	}
}