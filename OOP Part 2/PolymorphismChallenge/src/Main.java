public class Main {

    public static void main(String[] args) {

        Car car = new Car("2023 Porsche Panamera GTS");
        runRace(car);

        Car porsche = new GasPoweredCar("2023 Porsche Panamera GTS",12,8);
        runRace(porsche);

        Car tesla = new ElecricCar("2022 Tesla Model 3", 568,75);
        runRace(tesla);

        Car ferrari = new HybridCar("2022 Black Ferrari SF90 Stradale",16,8,8);
        runRace(ferrari);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
