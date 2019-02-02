
package bicycle;

public class Bicycle {
    
    protected String manufacturer;
    protected int gear;
    protected int speed;
    protected String tireType;
    public final long SERIAL_NUMBER = Math.abs(new java.util.Random().nextLong());
    
    public static int numberOfBicycles = 0;
    public static final int NUMBER_OF_WHEELS = 2;

    public Bicycle() {
        super();
        
        Bicycle.numberOfBicycles += 1;
        
        this.manufacturer = "Schwinn";
        this.gear = 1;
        this.speed = 0;
        this.tireType = "Standard";
    }
    
    public Bicycle(String manufacturer, int gear, int speed, String tireType) {
        this();
        this.manufacturer = manufacturer;
        this.gear = gear;
        this.speed = speed;
        this.tireType = tireType;
    }
    
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.gear = 3;
        b.speed = 0;
        
        Bicycle b2 = new Bicycle();
        System.out.println("Number of bikes: " + Bicycle.numberOfBicycles);
        System.out.println(b2.gear);
        
        System.out.println(b.manufacturer);
        b2.manufacturer = "Huffy";
        System.out.println(b.manufacturer);
        
        System.out.println(b.getTireType());
        MountainBike mb = new MountainBike();
        System.out.println("Number of bikes: " + Bicycle.numberOfBicycles);
        System.out.println(mb.getTireType());
        RoadBike rb = new RoadBike();
        System.out.println("Number of bikes: " + Bicycle.numberOfBicycles);
        System.out.println(rb.getTireType());
        mb.pedal(true);
        mb.pedal(true);
        mb.pedal(true);
        mb.pedal(false);
        System.out.println("The bike is going " + mb.getSpeed());
        rb.pedal(true);
        rb.pedal(true);
        rb.pedal(true);
        rb.pedal(false);
        System.out.println("The road bike is going " + rb.getSpeed());
        
        Bicycle customBike = new Bicycle();
        customBike.setGear(4);
        customBike.setManufacturer("ME!");
        customBike.setSpeed(100);
        customBike.setTireType("Bananas");
        System.out.println("Number of bikes: " + Bicycle.numberOfBicycles);
        
        
        System.out.println("Bike " + b + " serial #: " + b.SERIAL_NUMBER);
        System.out.println("Bike " + b2 + " serial #: " + b2.SERIAL_NUMBER);
        System.out.println("Bike " + mb + " serial #: " + mb.SERIAL_NUMBER);
        System.out.println("Bike " + rb + " serial #: " + rb.SERIAL_NUMBER);
        
        System.out.println(b.NUMBER_OF_WHEELS);
        System.out.println(b2.NUMBER_OF_WHEELS);
        System.out.println(mb.NUMBER_OF_WHEELS);
        
        customBike = null;
        
        System.out.println("Number of bikes: " + Bicycle.numberOfBicycles);
    }

    @Override
    protected void finalize() throws Throwable {
        Bicycle.numberOfBicycles -= 1;
        super.finalize();
    }
    
    

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
        public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }
    
    public void pedal(boolean forward) {
        if (forward) {
            this.speed += 10;
        }
        else {
            this.speed -= 1;
        }
    }
}
