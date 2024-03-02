
//illiustrate which package this class is packaged inside.
package acsse.csc2a.ifmb;

public class Pyrotechnician
{
	//default class members
	private static final String DEF_NAME = "T";
	private static final String DEF_SURNAME = "M";
	private static final String DEF_CONTACT = "tshepangjuniorm@gmail.com";
	//class members.
	private String pName;
	private String pSurname;
	private String pContactNO;
	
	
	//constructors.
	public Pyrotechnician()
	{
		this(DEF_NAME,DEF_SURNAME,DEF_CONTACT);
	}
	//parameterized constructor.
	public Pyrotechnician(String name,String surname,String numbers)
	{
		//initialising class members.
		this.pName = name;
		this.pSurname = surname;
		this.pContactNO = numbers;
	}
	
	//class methods(getters and setters).
	//to be editted!!
	public String getFormattedInfo()
	{
	    String formatedinfo = pName+"-"+pSurname;
		return formatedinfo;
	}
	public String getNumbers()
	{
		return pContactNO;
	}
}