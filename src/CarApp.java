import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		String make = "";
		String model = "";
		int year = 0; 
		double price = 0.0;
		
		Scanner scan = new Scanner(System.in); 
		ArrayList<Car> CarList = new ArrayList<>();
		
		System.out.println("Enter the number of cars you'd like to enter");
		int userInput = scan.nextInt();
		
		for (int i = 0; i < userInput; ++i) {
			Car car = new Car(make, model, year, price);
			scan.nextLine();
			System.out.println("OK, let's enter Car #" + (i + 1));
			System.out.println("Enter the make:");
			car.setMake(scan.nextLine());
			System.out.println("Enter the model:");
			car.setModel(scan.nextLine());
			System.out.println("Enter the year:");
			car.setYear(getInt(scan, "", 1900, 2018));
			System.out.println("Enter the price:");
			car.setPrice(getDouble(scan, "", 0, 1000000));
			
			CarList.add(car);
			System.out.println(CarList);
		}
		
	}
		 public static int getInt(Scanner scan, String prompt)
		    {
		        int i = 0;
		        boolean isValid = false;
		        while (isValid == false)
		        {
		            System.out.print(prompt);
		            if (scan.hasNextInt())
		            {
		                i = scan.nextInt();
		                isValid = true;
		            }
		            else
		            {
		                System.out.println("Error! Invalid integer value. Try again.");
		            }
		            scan.nextLine();  // discard any other data entered on the line
		        }
		        return i;
		    }

		    public static int getInt(Scanner scan, String prompt,
		    int min, int max)
		    {
		        int i = 0;
		        boolean isValid = false;
		        while (isValid == false)
		        {
		            i = getInt(scan, prompt);
		            if (i < min)
		                System.out.println(
		                    "Error! Number must be " + min + " or greater.");
		            else if (i > max)
		                System.out.println(
		                    "Error! Number must be " + max + " or less.");
		            else
		                isValid = true;
		        }
		        return i;
		    }

		    public static double getDouble(Scanner scan, String prompt)
		    {
		        double d = 0;
		        boolean isValid = false;
		        while (isValid == false)
		        {
		            System.out.print(prompt);
		            if (scan.hasNextDouble())
		            {
		                d = scan.nextDouble();
		                isValid = true;
		            }
		            else
		            {
		                System.out.println("Error! Invalid decimal value. Try again.");
		            }
		            scan.nextLine();  // discard any other data entered on the line
		        }
		        return d;
		    }

		    public static double getDouble(Scanner scan, String prompt,
		    double min, double max)
		    {
		        double d = 0;
		        boolean isValid = false;
		        while (isValid == false)
		        {
		            d = getDouble(scan, prompt);
		            if (d < min)
		                System.out.println(
		                    "Error! Number must be " + min + " or greater.");
		            else if (d > max)
		                System.out.println(
		                    "Error! Number must be " + max + " or less.");
		            else
		                isValid = true;
		        }
		        return d;
		    }
		
		
		
		
	
}
