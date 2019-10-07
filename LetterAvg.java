import java.io.IOException;

public class LetterAvg extends MesoInherit
{

	//char for first letter
	private char firstLetter;
	
	//default constructor set initial values to 0;
	public LetterAvg(char fLetter) throws IOException
	{
		this.firstLetter = fLetter;
	}
	
	

	//from driver
	public int numberOfStationWithLetterAvg()
	{
		int numStations = 0;
		char[] toCompare = new char[0];
		for(int i = 0 ; i < stations.size(); i++ )
		{
			toCompare = stations.get(i).toCharArray();
			if(toCompare[0] == (this.firstLetter))
			{
				numStations++;
			}
		}
		
		return numStations; 
	}
	
	/**
	 * @Overide
	 */
	protected char letterAverage()
	{
		
		return (char)getAverage();
		
	}
	//will need to return formatted string (From driver)
	public String toString()
	{
			return null;
	}
	
}
