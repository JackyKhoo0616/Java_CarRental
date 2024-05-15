import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
    private Customer customer;
    private Car car;
    private Date pickUpDate;
    private Date returnDate;
  
    // Getters and Setters for all attributes
    // ... (similar implementation as Car)
  
    // Method to calculate rental cost based on daily rate and duration
    public double calculateRentalCost() {
      long diffInMs = returnDate.getTime() - pickUpDate.getTime();
      int noOfDays = (int) (diffInMs / (1000 * 60 * 60 * 24));
      return noOfDays * car.getDailyRate();
    }
  
    @Override
    public String toString() {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      return "Car: " + car.getMake() + " " + car.getModel() + "\nPick Up Date: " + sdf.format(pickUpDate) + "\nReturn Date: " + sdf.format(returnDate) + "\nCost: $" + calculateRentalCost();
    }
  }