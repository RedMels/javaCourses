import java.util.Scanner;

public class Calculate
{
	public static void main(String[] args)
	{	
		Calculator calculator = new Calculator ();
		Scanner input = new Scanner(System.in);
		char check = 'y';
		
		while (check=='y')
		{
			calculator.operate();
			System.out.println("would you like to continue? (y)");
			check = input.next().charAt(0);
		}
	}
}