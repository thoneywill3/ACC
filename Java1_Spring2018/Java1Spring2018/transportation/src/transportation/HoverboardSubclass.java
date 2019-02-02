/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;

public class HoverboardSubclass extends Hoverboard implements IBar {
    
    @Override
    public int accelerate() {
        super.accelerate();
        return 0;
    }

    @Override
    public void bar() {
        System.out.println("Bar!");
    }
    
}
