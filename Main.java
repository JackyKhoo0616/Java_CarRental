import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
      ArrayList<Car> cars = FileManager.readCarsFromFile("cars.txt"); // Replace with your filename
      // ... (further program logic using Car objects and other functionalities)
    }
  }
  