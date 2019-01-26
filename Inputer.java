import java.util.Scanner;

public class Inputer
{
	Scanner input = new Scanner(System.in);
	
	private double first;
	private double second;
	private char operation;
	
	public void inputValuesAndOperation ()
	{
		System.out.println("give me the first number");
		first = input.nextDouble();
		
		System.out.println("give me the second number");
		second = input.nextDouble();
		
		System.out.println("then tell me what to do (+, -, * or /)");
		operation = Character.valueOf(input.next().charAt(0));
	}
	
	public double getFirst ()
	{
		return first;
	}
	
	public double getSecond ()
	{
		return second;
	}
	
	public char getOperation ()
	{
		return operation;
	}
}