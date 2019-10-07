
public class PosAvg extends MesoInherit{
	
	//
	private String stId;
	
	//@Param: stID is the station being send from driver
	public PosAvg(String stID)
	{
		this.stId = stID;
	}
	
	//from driver
	public int indexOfStation()
	{
		
		
		return 0; 
	}
	
	
	//will need to return formatted string (From driver)
	public String toString()
	{
			return null;
	}
}
