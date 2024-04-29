import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<Booking> bookingHistory;
  
    // Getters and Setters for all attributes
    // ... (similar implementation as Car)
  
    // Method to register a new customer
    public void registerCustomer() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter name: ");
      this.name = scanner.nextLine();
      System.out.println("Enter email: ");
      this.email = scanner.nextLine();
      System.out.println("Enter phone number: ");
      this.phoneNumber = scanner.nextLine();
      this.bookingHistory = new ArrayList<>(); // Initialize booking history
    }
  
    // Method to view booking history
    public void viewBookingHistory() {
      if (bookingHistory.isEmpty()) {
        System.out.println("No bookings found in history.");
      } else {
        for (Booking booking : bookingHistory) {
          System.out.println(booking); // Call Booking class toString() for formatted output
        }
      }
    }
  }
  
  