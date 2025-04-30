package main;

public class Car {
	
	//Base values for a car. (The zero'd constructor.)
	private String make = "";
	private String model = "";
	private String color = "";
	private int year = 0;
	private float mileage = 0f;
	
    // Default constructor.
    public Car(String newMake, String newModel, String newColor, int newYear, float newMileage) {
        this.make = newMake;
        this.model = newModel;
        this.color = newColor;
        this.year = newYear;
        this.mileage = newMileage;
    }

	//Setters.
	public void SetMake(String newMake) { this.make = newMake; }
	public void SetModel(String newModel) { this.model = newModel; }
	public void SetColor(String newColor) { this.color = newColor; }
	public void SetYear(int newYear) { this.year = newYear; }
	public void SetMileage(float newMileage) { this.mileage = newMileage; }
	
	//Getters.
	public String GetMake() { return this.make; }
	public String GetModel() { return this.model; }
	public String GetColor() { return this.color; }
	public int GetYear() { return this.year; }
	public float GetMileage() { return this.mileage; }
	
}
