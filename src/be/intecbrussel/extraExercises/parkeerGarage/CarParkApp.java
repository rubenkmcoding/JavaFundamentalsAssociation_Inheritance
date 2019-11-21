package be.intecbrussel.extraExercises.parkeerGarage;

public class CarParkApp {
    public static void main(String[] args) {

        //properties
        CarPark autoBoot = new CarPark();
        Car car1 = new Peugot("Peugot", 1200);
        Car car2 = new Peugot("Peugot", 1200);
        Car car3 = new Peugot("BMW ", 1800);
        Car car4 = new Peugot("BMW ", 1800);
        Car car5 = new Peugot("Porsche  ", 1200);
        Car car6 = new Peugot("Porsche  ", 1200);
        Car car7 = new Peugot("Tesla  ", 3000);
        Car car8 = new Peugot("Tesla  ", 3000);
        Car car9 = new Peugot("Audi  ", 1500);
        Car car10 = new Peugot("Audi  ", 1500);

        //adding the cars
        autoBoot.addCar(car1);
        autoBoot.addCar(car2);
        autoBoot.addCar(car3);
        autoBoot.addCar(car4);
        autoBoot.addCar(car5);
        autoBoot.addCar(car6);
        autoBoot.addCar(car7);
        autoBoot.addCar(car8);
        autoBoot.addCar(car9);
        autoBoot.addCar(car10);


        autoBoot.removeCar(car6);
        autoBoot.addCar(car10);

        System.out.println(autoBoot.printParkingLayout());

    }
}
