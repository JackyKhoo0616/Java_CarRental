import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<Booking> bookingHistory;
  
    // Getters and Setters for all attributes
    // ...
  
    // Method to register a new customer (can be empty for now)
    public void registerCustomer() {
      // Implement logic to capture customer details and add them to the object
    }
  
    // Method to view booking history
    public void viewBookingHistory() {
      if (bookingHistory.isEmpty()) {
        System.out.println("No bookings found in history.");
      } else {
        for (Booking booking : bookingHistory) {
          System.out.println(booking); // Implement toString() in Booking class for formatted output
        }
      }
    }
  }
  