package be.intecbrussel.extraExercises.parkeerGarage;

public class CarPark {

    //properties
    private String name;
    private Car[] parking;
    private int places = 0;

    //constructors
    CarPark () {
        this("");
    }

    CarPark (String name) {
        this(name,8);
    }

    CarPark (String name, int places) {
        this.name = name;
        this.places = places;
        parking = new Car[places];
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getPlaces() {
        return places;
    }

    //methods
    public void addCar (Car carIn) {
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                break;
            }
        }
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                parking[i] = carIn;
                System.out.println( parking[i].getBrandName() + "is parked on spot" + i);
                break;
            }
        }



    }

    public void addCar (int place, Car carIn) {
        if (parking[place] != null) {
            System.out.println("This space is full");
        }
        else {
            parking[place] = carIn;
        }
    }

    public void removeCar (Car carOut) {
        for (int i = 0; i < parking.length; i++) {
            if (parking[i].equals(carOut)) {
                System.out.println( i + " is free again since " + parking[i].toString() + " was removed.");
                parking[i] = null;
            }
        }
    }

    public void removeCar (int place) {
        if (parking[place] != null) {
            System.out.println( place + " is free again since " + parking[place].toString() + " was removed.");
            parking[place] = null;
        }
        else {
            System.out.println("There is no car parked here.");
        }
    }

    public String printParkingLayout () {
        String carParkLayout = "|| ";
        for (int i = 0; i < parking.length; i++) {
            carParkLayout = carParkLayout + parking[i].toString() + "||";
        }
        return carParkLayout;
    }




}
