package main;

//Allows us to use lists for our inventory.
import java.util.*; 

//Allows us to write to text files.
import java.io.FileWriter;
import java.io.IOException;

public class VehicleInventory {
	//Initializing the inventory list. (our cars!)
	public static List<Car> inventory = new ArrayList<Car>();
	
	
	// Main code to play with management of the inventory
    public static void main(String[] args) {
    	
    	 //Creating some cars to play around with for demonstration of this code.
    	 Car car1 = new Car("Volkswagen", "Beetle", "Yellow", 2016, 45000f);
    	 Car car2 = new Car("Honda", "Accord", "Blue", 2020, 25000f);
    	 Car car3 = new Car("Tesla", "Cybertruck", "Grey", 2024, 10f);
    	 
    	 //Adding the cars we just made above into the inventory.
    	 AddCar(car1);
    	 AddCar(car2);
    	 AddCar(car3);
    	 
    	 //Just a spacer in the output for readability in the console log.
    	 System.out.println("");
    	 
    	 //Updating Car attributes example.
    	 car1.SetColor("Blue"); //The cool way :^)
    	 UpdateAllVehicleProperties(car3, "Tesla", "Cybertruck", "Black", 2024, 12.2f); //The stinky way.
    	 
    	 //Just another spacer in the output for readability in the console log.
    	 System.out.println("");
    	 
    	 //Example of removing a car.
    	 RemoveCar(car2);
    	 
    	 //Yet another spacer! :)
    	 System.out.println("");
    	 
    	 //Saving inventory to a text file called "Vehicle Inventory.txt"!
    	 SaveInventoryToFile("Vehicle Inventory.txt");
    }
	
	
	
	// This function will return the properties of a car in a set of strings.
	public static String[] GetCarDetails(Car c) {
		String[] theDeets = new String[5];
		theDeets[0] = "Vehicle Make: " + c.GetMake();
		theDeets[1] = "Vehicle Model: " + c.GetModel();
		theDeets[2] = "Vehicle Color: " + c.GetColor();
		theDeets[3] = "Vehicle Year: " + c.GetYear();
		theDeets[4] = "Vehicle Mileage: " + c.GetMileage();
		return theDeets;
	}
	
	//A better way to do the above function, idk why on earth the assignment asked for a string array.
	public static String PrintCarDetails(Car c) {
		String theDeets = " a " + c.GetColor() + " " + c.GetMake() + " " + c.GetModel() +  " | Year: " + c.GetYear() + " | Mileage: " + c.GetMileage()+" !"; 
		return theDeets;
	}
	
	// This function will add a car to the inventory list.
	public static void AddCar(Car c) { 
		inventory.add(c);
		System.out.println("Successfully added:"+PrintCarDetails(c));
	}
	
	// This function will remove a car from the inventory.
	public static void RemoveCar(Car c) {
		if(inventory.contains(c)) {
			System.out.println("Successfully removed"+PrintCarDetails(c));
			inventory.remove(c);
		} else {
			System.out.println("The vehicle you want to remove doesn't exist!");
		}
	}
	
	// This function updates car attributes.
    // The redundancy of having setters in my car class and using this function is not lost on me.
    public static void UpdateAllVehicleProperties(Car toUpdate, String newMake, String newModel, String newColor, int newYear, float newMileage) {
        try {
            toUpdate.SetMake(newMake);
            toUpdate.SetModel(newModel);
            toUpdate.SetColor(newColor);
            toUpdate.SetYear(newYear);
            toUpdate.SetMileage(newMileage);
            System.out.println("Successfully updated"+PrintCarDetails(toUpdate));
        } catch (Exception e) {
        	System.out.println("Failed to update vehicle: " + e.getMessage());
        }
    }
    
    //This function spits our vehicle inventory out to a text file.
    public static void SaveInventoryToFile(String filename) {
    	try {
            FileWriter myWriter = new FileWriter(filename);
            for(int i = 0; i < inventory.size(); i++){
                myWriter.write("Vehicle #"+ (i+1) +": " + PrintCarDetails(inventory.get(i)));
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
