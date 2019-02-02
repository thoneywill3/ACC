/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;

public class Transportation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c = new Car();
        c.accelerate();
        c.accelerate();
        System.out.println("Current speed is: " + c.getCurrentSpeed());
        c.stop();
        System.out.println("Current speed is: " + c.getCurrentSpeed());
        
        Hoverboard h = new Hoverboard();
        h.accelerate();
        h.accelerate();
        System.out.println("Hoverboard speed is: " + h.getCurrentSpeed());
        h.stop();
        System.out.println("Hoverboard speed is: " + h.getCurrentSpeed());
        
        IModeOfTransportation modeOfTransportation = new Car();
        modeOfTransportation.accelerate();
        modeOfTransportation = new Hoverboard();
        modeOfTransportation.accelerate();
        IModeOfTransportation[] garage = new IModeOfTransportation[5];
        garage[0] = new Car();
        garage[1] = new Hoverboard();
        Car newCar = new Car();
        newCar.setAccelerationPotential(100);
        garage[2] = newCar;
        garage[3] = new Hoverboard();
        garage[4] = new HoverboardSubclass();
        
        for(IModeOfTransportation thing : garage) {
            thing.fuelUp();
        }
    }
    
}
