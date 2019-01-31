public class Clinic
{
	public static void main (String[] args)
	{
		Interface clinicInterface = new Interface ();
		
		do 
		{
			clinicInterface.menu ();
			clinicInterface.picker ();
		}
		while (clinicInterface.getIndex()!=10);	
	}
}