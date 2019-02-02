/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;

public class Hoverboard extends SciFiTech 
        implements IModeOfTransportation, IFoo {

    private int currentSpeed;
    private int accelerationPotential;
    private int maxSpeed;
    private double fuelPercentage;
    private boolean canReverse;
    private Orientation orientation;

    private double length;
    private double width;
    private double weight;

    private double price;

    public Hoverboard() {
        this.currentSpeed = 0;
        this.accelerationPotential = 3;
        this.maxSpeed = 15;
        this.fuelPercentage = 1;
        this.canReverse = true;
        this.orientation = Orientation.NORTH;

        this.length = 2;
        this.width = 0.8;
        this.weight = 3;

        this.price = 1000000.00;
    }
    
    //* ***** ** This is for IModeOfTransportation

    @Override
    public int accelerate() {
        if (this.fuelPercentage == 0) {
            System.out.println("You're just pushing a board at this point.");
            this.currentSpeed = 1;
        } else {
            System.out.println("OoooOoOoOoOoOoOO");
            this.currentSpeed += this.accelerationPotential;
            if (this.currentSpeed > this.maxSpeed) {
                this.currentSpeed = this.maxSpeed;
            }
            this.fuelPercentage -= 0.01;
            if (this.fuelPercentage < 0) {
                this.fuelPercentage = 0;
            }
        }
        return this.currentSpeed;
    }

    @Override
    public void fuelUp() {
        this.fuelPercentage = 1;
    }

    @Override
    public Orientation turnLeft() {
        switch (this.orientation) {
            case NORTH:
                this.orientation = Orientation.WEST;
                break;
            case EAST:
                this.orientation = Orientation.NORTH;
                break;
            case SOUTH:
                this.orientation = Orientation.EAST;
                break;
            case WEST:
                this.orientation = Orientation.SOUTH;
                break;
        }
        return this.orientation;
    }

    @Override
    public Orientation turnRight() {
        switch (this.orientation) {
            case NORTH:
                this.orientation = Orientation.EAST;
                break;
            case EAST:
                this.orientation = Orientation.SOUTH;
                break;
            case SOUTH:
                this.orientation = Orientation.WEST;
                break;
            case WEST:
                this.orientation = Orientation.NORTH;
                break;
        }
        return this.orientation;
    }
    
    @Override
    public void stop() {
        System.out.println("OoooooOOooO");
        this.currentSpeed = 0;
    }
    
    //Standard Getters and Setters beyond this point.

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getAccelerationPotential() {
        return accelerationPotential;
    }

    public void setAccelerationPotential(int accelerationPotential) {
        this.accelerationPotential = accelerationPotential;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
    }

    public boolean isCanReverse() {
        return canReverse;
    }

    public void setCanReverse(boolean canReverse) {
        this.canReverse = canReverse;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void foo() {
        System.out.println("Foo!");
    }
    
    
}
