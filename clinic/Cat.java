class Cat extends Pet
{
	@Override
	public void makeSound()
	{
		System.out.println ("Meeeee-oo-w!");
	}
		
	Cat (String name, String nameOfMaster)
	{
		super(name, nameOfMaster);
	}
}