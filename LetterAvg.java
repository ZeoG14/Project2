import java.io.IOException;
import java.util.*;

public class LetterAvg extends MesoInherit
{

	//char for first letter
	private char firstLetter;
	
	//array of strings to hold the names of the stations
	private ArrayList<String> nameOfStations = new ArrayList<String>();
	
	//default constructor set initial values to 0;
	public LetterAvg(char firstLetter) throws IOException
	{
		this.firstLetter = firstLetter;
	}
	
	

	//from driver
	public int numberOfStationWithLetterAvg()
	{
		int numStations = 0;
		char[] toCompare = new char[0];
		String station;
		for(int i = 0 ; i < stations.size(); i++ )
		{
			toCompare = stations.get(i).toCharArray();
			station = stations.get(i);
			if(toCompare[0] == (this.firstLetter))
			{
				this.nameOfStations.add(station);
				numStations++;
			}
		}
		
		return numStations; 
	}
	
	
	//will need to return formatted string (From driver)
	public String toString()
	{
			String toPrint  = String.format("They are: \n");
			for(int i = 0; i < nameOfStations.size(); i++)
			{
				toPrint += nameOfStations.get(i) + "\n";
			}
			
			return toPrint;
	}
	
}
