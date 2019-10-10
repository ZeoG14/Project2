import java.io.IOException;
import java.util.*;

public class LetterAvg extends MesoInherit
{

	//char for first letter
	private char firstLetter;
	
	/**
	 * ArrayList that holds the names of the stations that begin with the specified char
	 */
	private ArrayList<String> nameOfStations = new ArrayList<String>();
	
	/**
	 * 
	 * @param firstLetter recieves the letter that will be compared in numberOfStationWithLetterAvg() to find the stations that begin with the letter
	 * @throws IOException
	 */
	public LetterAvg(char firstLetter) throws IOException
	{	
		readStations();
		this.firstLetter = firstLetter;
	}
	
	

	/**
	 * This method compares compares the first letter of the stations in the array list to firstLetter. 
	 * It also adds the stations that do begin with the letter. 
	 * @return an int containing the amount of stations that start with firstLetter.
	 */
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
	
	
	
	/**
	 * Return the class information in the proper format
	 */
	public String toString()
	{
		 
			
			String toPrint  = String.format("\nThey are:\n");
			for(int i = 0; i < nameOfStations.size(); i++)
			{
				if(i < (nameOfStations.size() - 1)) 
				{
					toPrint += nameOfStations.get(i) + "\n";
				}
				else
				{
					toPrint+= nameOfStations.get(i);
				}
				
			}
			
			return toPrint;
	}
	
}
