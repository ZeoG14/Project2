import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MesoInherit extends MesoAbstract {
	
	//creating list to hold all the names of the stations
	protected static ArrayList<String> stations = new ArrayList<String>();
	
	//MesoStation object containting the stID
	private MesoStation mesoStation;
	
	//Int array to hold the averages
	private int[] average;
	
	//default constructor
	public MesoInherit() throws IOException
	{
		readStations();
	}
	
	//constructor: what values need to set?
	public MesoInherit(MesoStation mesoStation)
	{
		this.mesoStation = mesoStation;
	}

	/**
	@Override
	*/
	int[] calAverage()			
	{		
		average[0] = getCeiling();
		average[1] = getCeiling();
		average[2] = getCeiling();
		
		return average;
		
		
	}
	
	/**
	 * @Overide
	 */
	protected char letterAverage()
	{
		
		return (char)getAverage();
		
	}
	
	 /**
     * Creates a list of station from the txt file. Each line of the txt represents a single station.
     * @param filename The file to read from.
     * @throws IOException
     */
	public static void readStations() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));

    	String strg;
    	// Throw out unnecessary data
    	strg = br.readLine();
    	strg = br.readLine();
    	//First row containing data
    	strg = br.readLine();


    	while(strg != null)
    	{

    		strg = strg.substring(1,5);
    		stations.add(strg);

    		strg = br.readLine();
    	}
    	br.close();
	}
	
	
	//for loop to add up ascii values and get ceiling division
	public int getCeiling()
	{
		//initilizing return
		int ceiling = 0;
		//variable to hold the sum of all the ascii values
		double sum = 0.0;
		//variable to hold the double division of the sum 4 to be able to cast ceiling as an int
		double average = 0.0;
		for(int i = 0; i < mesoStation.getStID().length(); i++ )
		{
			sum += mesoStation.getStID().charAt(i);
		}
		
		//getting the raw double ascii average
		average = sum / 4;
		//performing ceiling rounding on the ascii average and casting to int and assigning it to ceiling
		ceiling = (int)Math.ceil(average);
		
		return ceiling; 
	}
	
	//for loop to add up ascii values and get floor division
		public int getFloor()
		{
			//initilizing return
			int floor = 0;
			//variable to hold the sum of all the ascii valuesd
			double sum = 0.0;
			//variable to hold the double division of the sum 4 to be able to cast ceiling as an int
			double average = 0.0;
			for(int i = 0; i < mesoStation.getStID().length(); i++ )
			{
				sum += mesoStation.getStID().charAt(i);
			}
				
			//getting the raw double ascii average
			average = sum / 4;
			//performing ceiling rounding on the ascii average and casting to int and assigning it to ceiling
			floor = (int)Math.floor(average);
				
			return floor; 
		}
		
		//for loop to add up ascii values and get ceiling division
		public int getAverage()
		{
			//initilizing return
			int avg = 0;
			//variable to hold the sum of all the ascii values
			double sum = 0.0;
			//variable to hold the double division of the sum 4 to be able to cast ceiling as an int
			double average = 0.0;
			for(int i = 0; i < mesoStation.getStID().length(); i++ )
			{
				sum += mesoStation.getStID().charAt(i);
			}
			
			//getting the raw double ascii average
			average = sum / 4;
			
			//math operation to get just the fraction of the average
			double fraction = average % 1;
			
			if(fraction > 0.5)
			{
				//performing ceiling rounding on the ascii average and casting to int and assigning it to ceiling
				avg = (int)Math.ceil(average);
			}
			else
			{
				avg = (int)Math.floor(average);
			}
			
				
			return avg;  
		}
}
