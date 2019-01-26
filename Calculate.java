public class Calculate
{
	public static void main(String[] args)
	{	
		Calculator calculator = new Calculator ();
		Inputer inputer = new Inputer();
		
		do
		{
			calculator.operate();
			inputer.checker();				
		}
		while (inputer.getCheck()=='y');
	}
}