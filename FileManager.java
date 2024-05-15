import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

  public static ArrayList<Car> readCarsFromFile(String fileName) throws IOException {
    ArrayList<Car> cars = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new FileReader(fileName));
    String line;
    while ((line = reader.readLine()) != null) {
      String[] carData = line.split(",");
      Car car = new Car();
      car.setMake(carData[0]);
      car.setModel(carData[1]);
      car.setYear(Integer.parseInt(carData[2]));
      car.setAvailable(Boolean.parseBoolean(carData[3]));
      car.setDailyRate(Double.parseDouble(carData[4]));
      cars.add(car);
    }
    reader.close();
    return cars;
  }

  public static void writeCarsToFile(String fileName, ArrayList<Car> cars) throws IOException {
    FileWriter writer = new FileWriter(fileName);
    for (Car car : cars) {
      writer.write(car.getMake() +
