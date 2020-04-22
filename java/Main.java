class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!!");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andres Herrrera";
        car.passegenger = 4;
        car.printDataCar();

        Car carDos = new Car();
        car.license = "NQS000";
        car.driver = "Andres Diaz";
        car.passegenger = 5;
        car.printDataCar();
    }
}
