import java.util.Scanner;

public class NaturalNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int count = 0;
		int positiveNumbers = 0;

		while(count < 10){
			System.out.println("enter Positive number: ");
			int number = input.nextInt();

			if(number > 0){
				count++;
				positiveNumbers += number;
			}
			System.out.println(count);
		}

		System.out.print(positiveNumbers);
	
	}
}	