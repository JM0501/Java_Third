
//illustrate the package this class is in.
package acsse.csc2a.ifmb;

//class declarition.
public class Firework
{    
	//basic enumeration.
    public enum E_COLOUR
    {
	 RED,
	 GREEN,
	 BLUE,
	 YELLOW,
	 MAGNETA,
	 WHITE,
	 CYAN
    }

	//class constants.
	private static final String fwID = "FIREWORK1";
	private static final String fwName = "fDragon";
	private static final int fwFuse = 32;
	private static final E_COLOUR color = E_COLOUR.RED;
	
	//class members.
  	public String FireworkID;
	public String FireworkName;
	public int    FireWorkFuseL;
	public E_COLOUR FireWorkColour;
	
	//constructor.
	
    //default constructor
	Firework()
	{
		this(fwID,fwName,fwFuse,color);
	}
	//parameterized constructor.
	Firework(String fID,String name,int fLength,E_COLOUR colour)
	{
		//initialising class members.
		this.FireworkID = fID;
		this.FireworkName = name;
		this.FireWorkFuseL = fLength;
		this.FireWorkColour = colour;
	}
}