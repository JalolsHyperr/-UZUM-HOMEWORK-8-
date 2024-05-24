public class Main {
    public static void main(String[] args) {
        FactoryAF factory = new FactoryAF();

        // Добавление автомобилей
        factory.addCar(new Car("Small"));
        factory.addCar(new Car("Medium"));
        factory.addCar(new Car("Large"));

        // Добавление клиентов
        factory.addCustomer(new Customer("Alice"));
        factory.addCustomer(new Customer("Bob"));
        factory.addCustomer(new Customer("Charlie"));

        // Отображение информации до выполнения метода saleCar()
        System.out.println("Cars in factory before sale:");
        factory.displayCars();

        System.out.println("\nCustomers before sale:");
        factory.displayCustomers();

        // Выполнение метода saleCar()
        factory.saleCar();

        // Отображение информации после выполнения метода saleCar()
        System.out.println("\nCars in factory after sale:");
        factory.displayCars();

        System.out.println("\nCustomers after sale:");
        factory.displayCustomers();
    }
}
