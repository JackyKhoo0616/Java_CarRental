import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static ArrayList<Car> readCarsFromFile(String fileName) throws IOException {
      ArrayList<Car> cars = new ArrayList<>();
      BufferedReader reader = new BufferedReader(new FileReader(fileName));
      String line;
      while ((line = reader.readLine()) != null) {
        String[] carData = line.split(","); // Split data based on comma separator
        Car car = new Car();
        car.setMake(carData[0]); // Assuming data order in the file
        car.setModel(carData[1]);
        // ... (set other attributes based on data order)
        cars.add(car);
      }
      reader.close();
      return cars;
    }
  }
  