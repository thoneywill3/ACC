
package bicycle;

public class MountainBike extends Bicycle {
    
    public MountainBike() {
        super();
        super.tireType = "Rough Terrain";
    }
    
    @Override
    public void pedal(boolean forward) {
        if (forward) {
            speed += 5;
        }
        else {
            speed -= 1;
        }
    }
}
