import java.util.ArrayList;
import java.util.List;

public class FactoryAF {
    private List<Car> cars = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void saleCar() {
        for (Customer customer : customers) {
            if (!cars.isEmpty()) {
                customer.setCar(cars.remove(0));
            }
        }
        // Очистка коллекции автомобилей, если они остались после раздачи
        cars.clear();
    }

    public void displayCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars in the factory.");
        } else {
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }

    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
