import java.io.IOException;

public class PosAvg extends MesoInherit
{

	/**
	 * station id being received
	 */
	private String stId;

	/**
	 * station that is n-1
	 */
	private String stationMinus1;

	/**
	 * station that is n+1
	 */
	private String stationPlus1;

	/**
	 * station that is n-2
	 */
	private String stationMinus2;

	/**
	 * station that is n+1
	 */
	private String stationPlus2;

	/**
	 * @param stID the name of the station being received
	 * @throws IOException
	 */
	public PosAvg(String stID) throws IOException 
	{
		readStations();
		this.stId = stID;
	}

	/**
	 * 
	 * @return the index of the station + 1 since array list begins at [0)
	 */
	public int indexOfStation() 
	{
		int index = 0;

		for (int i = 0; i < stations.size(); i++)
		{

			if (stations.get(i).equalsIgnoreCase(stId)) 
			{
				index = i + 1;
			}

		}
		
		otherStations(index);
		
		return index;
	}

	/**
	 * Finds the stations n +- 1 and n +- 2
	 * @param index
	 */
	public void otherStations(int index)
	{
		index = index - 1;
		if (index > 1 && index < 120) 
		{
			this.stationMinus1 = stations.get(index - 1);
			this.stationMinus2 = stations.get(index - 2);

			this.stationPlus1 = stations.get(index + 1);
			this.stationPlus2 = stations.get(index + 2);
		}

	}

	/**
	 * Class toString that returns properly formatted string
	 */
	public String toString() 
	{
		return String.format("This index is average of %s and %s, %s and %s, and so on.", stationMinus1, stationPlus1,
				stationMinus2, stationPlus2);
	}
}
