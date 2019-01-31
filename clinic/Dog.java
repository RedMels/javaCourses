class Dog extends Pet
{
	@Override
	public void makeSound()
	{
		System.out.println ("Bark-Bark!");
	}
	
	Dog (String name, String nameOfMaster)
	{
		super(name, nameOfMaster);
	}
}