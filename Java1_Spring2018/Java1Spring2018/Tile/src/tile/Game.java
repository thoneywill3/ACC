/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tile;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        //This will give me a 10x10 field.
        MineField mineField = new MineField();
        Scanner scanner = new Scanner(System.in);
        //mineField.print();
        while (!mineField.isIsDead()) {
            mineField.playerPrint();
            System.out.println("Make your move ([c/f],x,y):");
            String input = scanner.nextLine();
            String[] xyStrings = input.split(",");
            String choice = xyStrings[0];
            int x = new Integer(xyStrings[1]);
            int y = new Integer(xyStrings[2]);
            System.out.println("Yay!");
            if (choice.equalsIgnoreCase("c")) {
                mineField.choose(x, y);
            } else {
                mineField.flag(x, y);
            }
        }

    }
}
