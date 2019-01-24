import java.util.Scanner;

public class Calculate
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		double first;
		double second;
		char operation;
		double result;
		
		System.out.println("give me the first number");
		first = input.nextDouble();
		
		System.out.println("give me the second number");
		second = input.nextDouble();
		
		System.out.println("then tell me what to do (+, -, * or /)");
		operation = input.next().charAt(0);

		
		switch (operation)
		{
			case '+':
				result = first + second;
				System.out.println("the result is = " + result);
				break;
			case '-':
				result = first - second;
				System.out.println("the result is = " + result);
				break;
			case '*':
				result = first * second;
				System.out.println("the result is = " + result);
				break;
			case '/':
				result = first / second;
				System.out.println("the result is = " + result);
				break;
			default:
				System.out.println("irregular input");
		}
	}
}