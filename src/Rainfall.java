/* 
 * Name: Dejanae Shirley
 */

import java.util.Scanner;
import java.util.Arrays;

public class Rainfall {
	//declarations
	private double averageRainfall;
	private int[] rainfallInfo;
	int j = 0; 
	
	//Accessory for for rainfall
	public int[] getRainfall() {
        return rainfallInfo;
    }
	//Mutator for rainfall
    public void setRainfall(int[] rainfallInfo) {
        this.rainfallInfo = rainfallInfo;
    }
    public Rainfall() {
    	/*This code initializes an integer array called "rainfallInfo" with a length of 7.
    	 *The array will store rainfall information,
    	 *and has the indexes from 0 to 6 to represent the seven days of the week.
    	 */
        rainfallInfo = new int [7];
    }
    /*This method prompts the user to enter the daily rain
     *and loads the information into the array 
     */
    public void RainfallInfo() {
    	Scanner input = new Scanner(System.in);
    	for(int j = 0; j < 7; j++) {
    	System.out.println("Please enter the Rainfall of the day "+(j+1)+":");
    	getRainfall()[j] = input.nextInt();
    	}
    	input.close();//closes the input
    }
    /*This method is used to calculate the average rainfall for 
     * the week
     */
    public void calculateAvgRainfall() { 
    	double total = 0;
    	for(int j = 0; j < 7; j++) {
    		total += rainfallInfo[j];
    	}
    	averageRainfall = total/rainfallInfo.length;//formula for the average
    	System.out.printf("AVERAGE: %.2f\n",averageRainfall);//outputs the average and format to two decimal places
    }
    
    public void Report() { //print report of the daily rainfall 
    	System.out.println("DAILY RAINFALL");
    	System.out.println(Arrays.toString(rainfallInfo));//string representation of the "rainfallInfo" array
    		}
}