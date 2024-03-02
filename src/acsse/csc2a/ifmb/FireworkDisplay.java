
//illustrate the package this class is in.
package acsse.csc2a.ifmb;

//import acsse.csc2a.ifmb.Pyrotechnician;

//class declarition'.
public class FireworkDisplay
{
	//class members.
	String DisplayID;
	String DisplayName;
    String Displaytheme;
	int    DisplayNumFirework = 3;
	//lead technician.
	public Pyrotechnician pTechnitian;
	//an array of fireworks to be used in display.
	public Firework[] arrFireworks = new Firework[DisplayNumFirework];
	
	//constructors.
	//parameterized constructor.
	public FireworkDisplay(String dID,String name,String theme,int numFirework)
	{
		//initialise class members.
		this.DisplayID = dID;
		this.DisplayName = name;
		this.Displaytheme = theme;
		this.DisplayNumFirework = numFirework;
	}
	
	//class methods.
	public void printDisplay()//printing method. 
	{
		/**
		*display the neccessary information about the DisplayFirework class.
		*/
		System.out.println("--DisplayFirework information--");
		System.out.println("\tID: "+DisplayID);
		System.out.println("\tName: "+DisplayName);
		System.out.println("\tTheme: "+Displaytheme);
		
		/**
		*display the neccessary information about the assigned Pyrotechnician.
		*/
		System.out.println();//skip a line for better information formatting.
		System.out.println("--Pyrotechnician information--");
		System.out.println("\tFullname: "+pTechnitian.getFormattedInfo());
		System.out.println("\tContact Info.: "+pTechnitian.getNumbers());
		
		/**
		*disply information for each firework.
		*/
		for(int i = 0;i < arrFireworks.length - 1;i++)
		{
			int count = i + 1;
			//System.out.println(arrFireworks.length-1);
			System.out.println("--FireWork_"+count+" information--");
			System.out.println("\tID: "+arrFireworks[i].FireworkID);
			System.out.println("\tName: "+arrFireworks[i].FireworkName);
			System.out.println("\tFuse-Length[cm]: "+arrFireworks[i].FireWorkFuseL);
			System.out.println("\tColour: "+arrFireworks[i].FireWorkColour);
		}
		//System.out.println();//skip a line.
	}
	
    public void addFirework(String fID, String fName, int fLength, Firework.E_COLOUR colour) {
        // Check if there is space in the array to add the firework
        if (arrFireworks != null && arrFireworks.length > 0) {
            // Find the first empty slot in the array
            for (int i = 0; i < arrFireworks.length; i++) {
                if (arrFireworks[i] == null) {
                    // Create a new Firework object and add it to the array
                    arrFireworks[i] = new Firework(fID, fName, fLength, colour);
                    break; //exit loop once the firework is added.
                }
            }
        } else {
            System.out.println("Error: Array of fireworks is not properly initialized.");
        }
    }
}