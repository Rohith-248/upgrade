package javaprogramming;

class TubeLight//This is superclass
{
	public void lightOn()
	{
		System.out.println("The Tube Light is On");
	}
}

class SwitchButton extends TubeLight//this is subclass which extends the superclass
{
	public void switchOn()
	{
		System.out.println("The Switch is On");
	}
}

public class Inheritance_Method 
{
	public static void main(String[] args) 
	{
		//creating object for subclass
		SwitchButton button=new SwitchButton();
		button.switchOn();
		button.lightOn();//using subclass ref variable accessing the superclass method
						 //because subclass can acsess the properties of superclass 
		
	}

}
