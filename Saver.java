import java.util.Scanner;

public class Saver
{
	Scanner input = new Scanner(System.in);
	private char save = 'n';
	private char position = '0';
	
	public void talk()
	{
		System.out.println ("would you like to save the result for the future calculations? (y)");
		save = Character.valueOf(input.next().charAt(0));
		if (save=='y')
		{
			System.out.println ("for which position? (1/2)");
			position = Character.valueOf(input.next().charAt(0));
		}
	}
	
	public char getSave ()
	{
		return save;
	}
	public char getPosition ()
	{
		return position;
	}
}