import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MesoInherit extends MesoAbstract {

	/**
	 * Array list to hold the names of all the stations
	 */
	protected static ArrayList<String> stations = new ArrayList<String>();

	/**
	 * MesoStation object containting the stID
	 */
	private MesoStation mesoStation;

	/**
	 * default empty constructor
	 */
	public MesoInherit() 
	{
		stations = new ArrayList<String>();
		mesoStation = null;
	}

	/**
	 * 
	 * @param Receives mesoStation object and assigns it to the class level
	 *                 mesoStation
	 * @throws IOException
	 */
	public MesoInherit(MesoStation mesoStation) throws IOException 
	{
		readStations();
		this.mesoStation = mesoStation;
	}

	/**
	 * @Override Remove the Ceiling, Floor, and Average values in an int array
	 */
	int[] calAverage() 
	{
		int[] average = new int[3];

		average[0] = getCeiling();
		average[1] = getFloor();
		average[2] = getAverage();

		return average;
	}

	/**
	 * @Overide Returns the letterAverage which is just the getAverage() casted to a
	 *          char
	 */
	protected char letterAverage() 
	{

		return (char) getAverage();

	}

	/**
	 * Creates a list of station from the txt file. Each line of the txt represents
	 * a single station.
	 * 
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
		strg = br.readLine();
		// First row containing data
		strg = br.readLine();

		while (strg != null) {

			strg = strg.substring(1, 5);
			stations.add(strg);

			strg = br.readLine();
		}
		br.close();
	}

	/**
	 * for loop to add up ascii values and get ceiling division
	 * 
	 * @return Returns an the sum of the ascii values divided by the length of the
	 *         mesoStation ID and performs ceiling division
	 */
	public int getCeiling() 
	{
		// initilizing return
		int ceiling = 0;
		// variable to hold the sum of all the ascii values
		double sum = 0.0;
		// variable to hold the double division of the sum 4 to be able to cast ceiling
		// as an int
		double average = 0.0;
		// for loop to add up all the ascii values
		for (int i = 0; i < mesoStation.getStID().length(); i++) 
		{
			sum += mesoStation.getStID().charAt(i);
		}

		// getting the raw double ascii average
		average = sum / mesoStation.getStID().length();
		// performing ceiling rounding on the ascii average and casting to int and
		// assigning it to ceiling
		ceiling = (int) Math.ceil(average);

		return ceiling;
	}

	// for loop to add up ascii values and get floor division
	public int getFloor() 
	{
		// initilizing return
		int floor = 0;
		// variable to hold the sum of all the ascii values
		double sum = 0.0;
		// variable to hold the double division of the sum 4 to be able to cast ceiling
		// as an int
		double average = 0.0;
		// for loop to add up all the ascii values
		for (int i = 0; i < mesoStation.getStID().length(); i++) 
		{
			sum += mesoStation.getStID().charAt(i);
		}

		// getting the raw double ascii average
		average = sum / mesoStation.getStID().length();
		// performing floor division on the ascii average and casting to int and
		// assigning it to ceiling
		floor = (int) Math.floor(average);

		return floor;
	}

	// for loop to add up ascii values and get ceiling division
	public int getAverage() 
	{
		// initilizing return
		int avg = 0;
		// variable to hold the sum of all the ascii values
		double sum = 0.0;
		// variable to hold the double division of the sum 4 to be able to cast ceiling
		// as an int
		double rawAverage = 0.0;
		// for loop to add up all the ascii values
		for (int i = 0; i < mesoStation.getStID().length(); i++) 
		{
			sum += mesoStation.getStID().charAt(i);
		}

		// getting the raw double ascii average
		rawAverage = sum / mesoStation.getStID().length();

		avg  = (int)Math.round(rawAverage);
		
		return avg;
	}

}
