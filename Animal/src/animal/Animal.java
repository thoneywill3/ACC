/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

public class Animal {

    private int hunger;
    private int thirst;
    private int fatigue;
    
    public Animal() {
        this.hunger = 100;
        this.fatigue = 100;
        this.thirst = 100;
    }
    
    public Animal(int hunger, int fatigue, int thirst) {
        
        this.setHunger(hunger);
        this.setThirst(thirst);
        this.setFatigue(fatigue);
    }
    
    public int getHunger() {
        return this.hunger;
    }
    
    public final void setHunger(int hunger) {
        this.hunger = hunger;
        if (this.hunger > 100)
            this.hunger = 100;
        if (this.hunger < 0)
            this.hunger = 0;
    }

    public int getThirst() {
        return thirst;
    }

    public final void setThirst(int thirst) {
        this.thirst = thirst;
        if (this.thirst > 100)
            this.thirst = 100;
        if (this.thirst < 0)
            this.thirst = 0;
    }

    public int getFatigue() {
        return fatigue;
    }

    public final void setFatigue(int fatigue) {
        this.fatigue = fatigue;
        if (this.fatigue > 100)
            this.fatigue = 100;
        if (this.fatigue < 0)
            this.fatigue = 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Animal a = new Animal();
//        System.out.println(a.getHunger());
//        a.setHunger(-1000);
//        System.out.println(a.getHunger());
//        Animal a2 = new Animal(50, 20, 33);
//        System.out.println(a2.getThirst());
    }
    
}
