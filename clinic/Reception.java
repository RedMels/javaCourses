import java.util.Scanner;
import java.util.ArrayList;

public class Reception

{
	Scanner scanner = new Scanner (System.in);
	ArrayList<Client> clientList = new ArrayList<Client>();
	Client client;	

	public void clientCreation ()
	{
		System.out.println ("Input name");
		String name;
		name = scanner.nextLine();
		System.out.println ("Input age");
		int age;
		age = Integer.parseInt(scanner.nextLine());
		
		clientList.add(new Client(name, age));
	}
	
	public void clientDeletion ()
	{
		int i = 1;
		int index;
		for (Client c : clientList)
		{
			System.out.println (i + c.getName());
			i++;
		}
		System.out.println ("Input client's number to delete");
		index = Integer.parseInt(scanner.nextLine()) - 1;
		
		clientList.remove(index);
	}
	
	
	public void clientsToList()
	{
		int i = 1;
		for (Client c : clientList)
		{
			System.out.println (i+ ". " + c.getName());
			i++;
		}
	}
	
	public void petsToList()
	{
		for (Client c : clientList)
		{
			c.showPets();
		}
	}
	
	public void clientSearch()
	{
		System.out.println ("Input name");
		String name;
		name = scanner.nextLine();
		int index = 0;
		
		for (Client c : clientList)
		{
			if ( c.getName().equals(name) ) 
			{
				index = clientList.indexOf(c) + 1;
				System.out.println (index + ". " + c.getName());
			}
		}
	}
	
	public void petSearch()
	{
		System.out.println ("Input name");
		String name;
		name = scanner.nextLine();
		int index = 0;
		
		for (Client cSearch : clientList)
		{
			for (Dog dogSearch : cSearch.dogList)
			{
				if ( dogSearch.getName().equals(name) ) 
				{
					System.out.println (dogSearch.getName() + " of " + dogSearch.belongsToClient());
				}
			}
			
			for (Cat catSearch : cSearch.catList)
			{
				if ( catSearch.getName().equals(name) ) 
				{
					System.out.println (catSearch.getName() + " of " + catSearch.belongsToClient());
				}
			}
		}
	}
	
	public void petAdding ()
	{
		for (Client c : clientList)
			{
				int index = clientList.indexOf(c) + 1;
				System.out.println (index+". "+c.getName());
			}
		
		System.out.println ("for which client? (1, 2, 3 ...)");
		
		int number = Integer.parseInt(scanner.nextLine()) - 1;
		
		clientList.get(number).addPet();
	}
	
	public void petDeletion ()
	{
		for (Client c : clientList)
			{
				int index = clientList.indexOf(c) + 1;
				System.out.println (index+". "+c.getName());
			}
		
		System.out.println ("who's pets to delete? (1, 2, 3 ...)");
		
		int number = Integer.parseInt(scanner.nextLine()) - 1;
		
		clientList.get(number).deletePet();
	}
	
	public void ShowClientData ()
	{
		String name;
		System.out.println ("input client's name");
		name = scanner.next();
		for (Client c : clientList)
		{
			if ( c.getName().equals(name) ) 
			{
				System.out.println ("Client "+ c.getName() + " is: " + c.getAge() + " years old");
				c.showPets();
			}
		}
	}
}