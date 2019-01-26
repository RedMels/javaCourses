import java.util.Scanner;

public class Calculator
{
	private double result;
	
	Inputer inputer = new Inputer();
	Saver saver = new Saver();
	private double first;
	private double second;
	private char operation;
	
	public void operate()
	{
		if (!(saver.getPosition () == '1'))
		{
		inputer.inputFirstValue();
		}

		if (!(saver.getPosition () == '2'))
		{
		inputer.inputSecondValue();
		}
		
		inputer.inputOperation();
		
		if (saver.getSave ()=='y' && saver.getPosition ()=='1')
		{
			first = result;
		}
		else
		{
			first = inputer.getFirst();
		}
		
		if (saver.getSave ()=='y' && saver.getPosition ()=='2')
		{
			second = result;
		}
		else
		{
			second = inputer.getSecond();
		}
		
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
		saver.talk ();
	}
}