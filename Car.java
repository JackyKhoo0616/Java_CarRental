public class Car {
    private String make;
    private String model;
    private int year;
    private boolean available;
    private double dailyRate;
  
    // Getters and Setters for all attributes
    // ...
  
    // Method to display car information
    public void displayCarInfo() {
      System.out.println("Make: " + make);
      System.out.println("Model: " + model);
      System.out.println("Year: " + year);
      System.out.println("Available: " + available);
      System.out.println("Daily Rate: $" + dailyRate);
    }
  }
  