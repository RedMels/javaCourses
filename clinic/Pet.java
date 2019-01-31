public abstract class Pet
{
	private String name;
	private String nameOfMaster;
	public abstract void makeSound();
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public void setNameOfMaster (String nameOfMaster)
	{
		this.nameOfMaster = nameOfMaster;
	}
	
	public String getName ()
	{
		return name;
	}
	
	
	public String belongsToClient ()
	{
		return nameOfMaster;
	}
	
	Pet (String name, String nameOfMaster)
	{
		this.setName(name);
		this.setNameOfMaster(nameOfMaster);
	}
}