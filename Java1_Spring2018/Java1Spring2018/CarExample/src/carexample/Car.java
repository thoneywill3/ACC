/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carexample;

public class Car {
    private Tire frontDriverTire;
    private Tire frontPassengerTire;
    private Tire rearDriverTire;
    private Tire rearPassengerTire;
    private Engine engine;
    private Passenger[] passengers;
    
    private static final int numberOfPassengers = 2;
    private static final String manufacturer = "Toyota";
    
    public Car() {
        this.frontDriverTire = new Tire();
        this.frontPassengerTire = new Tire();
        this.rearDriverTire = new Tire();
        this.rearPassengerTire = new Tire();
        this.engine = new Engine();
        this.passengers = new Passenger[numberOfPassengers];
        for (int i=0; i<numberOfPassengers; i++) {
            this.passengers[i] = new Passenger();
        }
    }

    public Tire getFrontDriverTire() {
        return frontDriverTire;
    }

    public void setFrontDriverTire(Tire frontDriverTire) {
        this.frontDriverTire = frontDriverTire;
    }

    public Tire getFrontPassengerTire() {
        return frontPassengerTire;
    }

    public void setFrontPassengerTire(Tire frontPassengerTire) {
        this.frontPassengerTire = frontPassengerTire;
    }

    public Tire getRearDriverTire() {
        return rearDriverTire;
    }

    public void setRearDriverTire(Tire rearDriverTire) {
        this.rearDriverTire = rearDriverTire;
    }

    public Tire getRearPassengerTire() {
        return rearPassengerTire;
    }

    public void setRearPassengerTire(Tire rearPassengerTire) {
        this.rearPassengerTire = rearPassengerTire;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public static int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public static String getManufacturer() {
        return manufacturer;
    }
}
