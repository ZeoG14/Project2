import java.io.IOException;

public class PosAvg extends MesoInherit{
	
	//station id being received
	private String stId;
	
	//station that is n-1
	private String stationMinus1;
	
	//station that is n+1
	private String stationPlus1;
	
	//station that is n-2
	private String stationMinus2;
	
	//station that is n+1
	private String stationPlus2;
	
	//@Param: stID is the station being send from driver
	public PosAvg(String stID)throws IOException
	{
		this.stId = stID;
		
	}
	
	//from driver
	public int indexOfStation()
	{
		int index = 0;
		
		
		for(int i = 0; i < stations.size(); i++ )
		{
			
			if(stations.get(i).equalsIgnoreCase(stId))
			{
				
				index = i;
			}
		}
		
		//sending stations to index to set the other average variables
		otherStations(index);
		
		return index; 
	}
	
	
	public void otherStations(int index)
	{
		this.stationMinus1 = stations.get(index - 1);
		this.stationMinus2 = stations.get(index - 2);
		
		this.stationPlus1 = stations.get(index + 1);
		this.stationPlus2 = stations.get(index + 2);
	}
	
	
	//will need to return formatted string (From driver)
	public String toString()
	{
		return String.format("This index is average of %s and %s, %s and %s, and so on.", stationMinus1,stationPlus1,stationMinus2,stationPlus2);
	}
}
