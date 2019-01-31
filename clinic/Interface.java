import java.util.Scanner;

public class Interface
{
	Scanner scanner = new Scanner(System.in);
	Reception clinicReception = new Reception ();
	private int index;
	
	public void menu ()
	{	
		System.out.println ("main menu: input command index");
		System.out.println ("1.add client");
		System.out.println ("2.delete client");
		System.out.println ("3.add pet");
		System.out.println ("4.delete pet");
		System.out.println ("5.show all clients");
		System.out.println ("6.show all pets");
		System.out.println ("7.search for client by name");
		System.out.println ("8.search for pet by name");
		System.out.println ("9.show clients data");
		System.out.println ("10.exit");
		index = scanner.nextInt();
	}
	
	public void picker ()
	{
		switch (index)
		{
			case 1: clinicReception.clientCreation();	break;
			case 2: clinicReception.clientDeletion();	break;
			case 3: clinicReception.petAdding();		break;
			case 4: clinicReception.petDeletion();		break;
			case 5: clinicReception.clientsToList();	break;
			case 6: clinicReception.petsToList();		break;
			case 7: clinicReception.clientSearch();		break;
			case 8: clinicReception.petSearch();		break;
			case 9: clinicReception.ShowClientData();	break;
			default: break;
		}
	}
	
	public int getIndex ()
	{
		return index;
	}
}