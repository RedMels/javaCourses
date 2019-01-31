import java.util.Scanner;
import java.util.ArrayList;

public class Client
{
	private String name;
	private int age;
	
	Scanner scanner = new Scanner (System.in);
	ArrayList<Dog> dogList = new ArrayList<Dog>();
	ArrayList<Cat> catList = new ArrayList<Cat>();
	Cat cat;
	Dog dog;
	
	
	public void addPet()
	{
		System.out.println ("dog or cat? (input dog/cat)");
		String petType;
		petType = scanner.next();
		String petName;
		if (petType.equals("dog"))
		{
			System.out.println ("Input name");
			petName = scanner.next();
		
			dogList.add(new Dog(petName, this.name));
		} 
		else if (petType.equals("cat"))
		{
			System.out.println ("Input name");
			petName = scanner.next();
		
			catList.add(new Cat(petName, this.name));
		}
		else
		{
			System.out.println ("What the pokemon???");
		}
	}
	
	public void showPets()
	{
		int i = 1;
		System.out.println ("dogs:");
		for (Dog g : dogList)
		{
			System.out.println (i + ". " + g.getName());
		}
		System.out.println ("cats:");
		for (Cat c : catList)
		{
			System.out.println (i + ". " + c.getName());
		}
	}
	
	public void deletePet()
	{
		System.out.println ("dog or cat? (input dog/cat)");
		String petType;
		petType = scanner.next();
		char agree;
		if (petType.equals("dog"))
		{
			for (Dog g : dogList)
			{
				int index = dogList.indexOf(g) + 1;
				System.out.println (index+". "+g.getName());
			}
			
			System.out.println ("pet number to delete? (1, 2, 3...)");
			
			int number = scanner.nextInt() - 1;
			
			System.out.println ("Sure? (y)");
			agree = scanner.next().charAt(0);
			
			if (agree=='y')
			{
				dogList.remove(number);
			}
		} 
		else if (petType.equals("cat"))
		{
			for (Cat c : catList)
			{
				int index = catList.indexOf(c) + 1;
				System.out.println (index+". "+c.getName());
			}
			
			System.out.println ("pet number to delete? (1, 2, 3...)");
			
			int number = scanner.nextInt() - 1;
			
			System.out.println ("Sure? (y)");
			agree = scanner.next().charAt(0);
			
			if (agree=='y')
			{
				catList.remove(number);
			}
		}
		else
		{
			System.out.println ("What the pokemon???");
		}
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public void setAge (int age)
	{
		this.age = age;
	}
	
	public String getName ()
	{
		return name;
	}
	
	public int getAge ()
	{
		return age;
	}
	
	Client (String name, int age)
	{
		this.setName(name);
		this.setAge(age);
	}
}