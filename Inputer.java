import java.util.Scanner;
public class Inputer
{
	Scanner input = new Scanner(System.in);
	
	
	private double first;
	private double second;
	private char operation;
	private char check = 'y';
	
	public void inputFirstValue ()
	{
		System.out.println("give me the first number");
		first = input.nextDouble();
	}
	
	public void inputSecondValue ()
	{
		System.out.println("give me the second number");
		second = input.nextDouble();
	}
	
	public void inputOperation ()
	{
		System.out.println("then tell me what to do (+, -, * or /)");
		operation = Character.valueOf(input.next().charAt(0));
	}
	
	public void checker ()
	{
		System.out.println("would you like to continue? (y)");
		check = Character.valueOf(input.next().charAt(0));
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
	
	public char getCheck ()
	{
		return check;
	}
}