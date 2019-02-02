
package singletonfun;

public class SingletonFun {
    
    private int favoriteNumber;
    private String name;
    private char grade;
    
    private static SingletonFun instance;
    
    
    public static SingletonFun getInstance() {
        if (SingletonFun.instance == null) {
            SingletonFun f = new SingletonFun();
            SingletonFun.instance = f;
            return f;
        }
        else 
            return SingletonFun.instance;
    }

    public static void main(String[] args) {
        Day d = Day.MONDAY;
        
        switch(d) {
            case MONDAY:
                System.out.println("It's Monday.");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday.");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday.");
                break;
            default:
                System.out.println("I don't care what day it is.");
        }
    }

    private SingletonFun() {
        favoriteNumber = 3;
        name = "Bob";
        grade = 'A';
    }

    public int getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setFavoriteNumber(int favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    
}
