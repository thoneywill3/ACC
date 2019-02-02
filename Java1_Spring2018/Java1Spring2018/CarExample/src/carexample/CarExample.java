/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carexample;


public class CarExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getFrontDriverTire());
        System.out.println(c.getFrontPassengerTire());
        Tire t = c.getFrontDriverTire();
        t.psi = 36;
        System.out.println(c.getFrontDriverTire().psi);
        for (Passenger p : c.getPassengers()) {
            System.out.println(p.name);
        }
        System.out.println(Car.getManufacturer());
    }
    
}
