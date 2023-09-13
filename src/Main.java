/* 
 *  Name: Dejanae Shirley
 */
public class Main {
	public static void main(String[]args) {
		Rainfall rainfall = new Rainfall();//creates a new object of the Rainfall class and assigns it to a variable called "rainfall"
		rainfall.RainfallInfo();//display information about the current rainfall data being stored in the "rainfall" object
		rainfall.Report();//generate a report based on the rainfall information stored in the "rainfall" object
		rainfall.calculateAvgRainfall();//return the calculated average rainfall or store it in a variable for future use
		//outputs the programmer's name and student number
		System.out.println("\nProgram by: Dejanae Shirley");
        System.out.println("Student Number: 041068775");
	}
}