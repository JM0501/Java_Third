
//import necessary packages.
import acsse.csc2a.ifmb.FireworkDisplay;
import acsse.csc2a.ifmb.Pyrotechnician;
import acsse.csc2a.ifmb.Firework;

public class Main
{
	public static void main(String args[])
	{
		if(args.length >= 0)
		{
           /**
		   *create two FireworkDisplay objects.
		   */
           FireworkDisplay[] arrFWDisplay = new FireworkDisplay[2];
           for (int i = 0; i < arrFWDisplay.length; i++) 
		   {
            int count = i + 1; //since arrays in Java are 0-indexed, we need a way to show count to make sense of hardcode values.

            /**
			*hardcoded values for display information.
			*/
            String displayID = "DisplayID_" + count;
            String displayName = "DisplayName_" + count;
            String displayTheme = "DisplayTheme_" + count;
			int numFireWorks = 2;

            /**
			*create memory for each firework display.
			*/
            arrFWDisplay[i] = new FireworkDisplay(displayID, displayName, displayTheme, numFireWorks);

            /**
			*hardcoded values for Pyrotechnician's details.
			*/
            String pName = "PyroName_" + count;
            String pSurname = "PyroSurname_" + count;
            String pNumbers = "123456789" + count;
             
			 //System.out.println(pName+pSurname);
            //assign Pyrotechnician to the current FD.
            arrFWDisplay[i].pTechnitian = new Pyrotechnician(pName, pSurname, pNumbers);
			
                /**
				*loop through n fireworks and add every single on to the current FD.
				*/
                for (int fw = 0; fw < arrFWDisplay[i].arrFireworks.length - 1; fw++) 
				{
                int fwc = fw + 1; // 0-indexed array, create fwc to keep track of firework number.

                //hardcoded values for firework information.
                String fID = "FireworkID_" + fwc;
                String fName = "FireworkName_" + fwc;
                int fLength = fw + 10; //example value for fLength.

                // Add firework to current FD.
                arrFWDisplay[i].addFirework(fID, fName, fLength, Firework.E_COLOUR.RED);
				}
			arrFWDisplay[i].printDisplay();
			}
		}
		else
		{
			System.out.println("Provide programe cmd arguments!!!");
		}
	}
}