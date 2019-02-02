/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetest;

import interfacetest.interfaces.*;

public class Squirtle implements IInterfaceTest, ISecondInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ISecondInterface test = new Squirtle();
        test.bar();
    }

    @Override
    public String foo(int x, int y) {
        return "ok";
    }

    @Override
    public String[] bar(String s) {
        return s.split(" ");
    }

    @Override
    public boolean splat() {
        return false;
    }
    
    @Override
    public void bar() {
        System.out.println("Bar.");
    }
    
    final public void squirt() {
        System.out.println("Squirtle squirt!");
    }
}
