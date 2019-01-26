import java.util.Scanner;

public class Calculator
{
	private double result;
	
	Inputer inputer = new Inputer();
	private double first;
	private double second;
	private char operation;
	
	public void operate()
	{
		inputer.inputValuesAndOperation();
		first = inputer.getFirst();
		second = inputer.getSecond();
		operation = inputer.getOperation();
		switch (operation)
		{
			case '+':
				result = first + second;
				System.out.println("the result is " + result);
				break;
			case '-':
				result = first - second;
				System.out.println("the result is " + result);
				break;
			case '*':
				result = first * second;
				System.out.println("the result is " + result);
				break;
			case '/':
				result = first / second;
				System.out.println("the result is " + result);
				break;
			default:
				System.out.println("irregular input");
		}
	}
}