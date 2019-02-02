/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

public class RoadBike extends Bicycle {
    
    public RoadBike() {
        super();
        this.tireType = "Skinny";
    }
    
    @Override
    public void pedal(boolean forward) {

        if (forward) {
            super.pedal(forward);
            speed += 5;
        }
        else {
            if (speed > 0) {
                System.out.println("OUCH!");
                speed -= 5;
            }
            else {
                speed -= 10;
            }
        }
    }
}
