/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;

public interface IModeOfTransportation {
    
    public int accelerate();
    public void fuelUp();
    public Orientation turnLeft();
    public Orientation turnRight();
    public void stop();
}
