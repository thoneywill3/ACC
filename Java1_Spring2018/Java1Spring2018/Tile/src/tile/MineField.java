package tile;

import java.util.Random;

public class MineField {

    private int length;
    private int width;
    private int numMines;
    private Tile[][] tiles;
    private boolean isDead;

    public MineField() {
        super();

        this.length = 10;
        this.width = 10;
        this.numMines = 30;
        makeField();
    }

    public MineField(int length, int width, int numMines) {

        this.length = length;
        this.width = width;
        this.numMines = numMines;
        makeField();
    }
    
    public void choose(int x, int y) {
        Tile t = tiles[x][y];
        if (t.isHasMine()) {
            System.out.println("You dead.");
            this.isDead = true;
        }
        else {
            t.setIsCleared(true);
        }
    }
    
    public void flag(int x, int y) {
        Tile t = tiles[x][y];
        if (t.isIsCleared()) {
            System.out.println("You can't do that.");
        }
        else {
            t.setHasFlag(!t.isHasFlag());
        }
    }

    public void print() {
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                tiles[i][j].print();
            }
            System.out.println("");
        }
    }

    public void playerPrint() {
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                tiles[i][j].playerPrint();
            }
            System.out.println("");
        }
    }

    private void makeField() {
        //Make the field without mines.
        tiles = new Tile[this.length][];
        for (int i = 0; i < this.length; i++) {
            tiles[i] = new Tile[this.width];
            for (int j = 0; j < this.width; j++) {
                tiles[i][j] = new Tile();
            }
        }

        //Populate the field with mines
        Random rand = new Random();
        int placed = 0;
        while (placed < this.numMines) {
            int randomLength = rand.nextInt(this.length); //A random number between 0 and length
            int randomWidth = rand.nextInt(this.width);
            Tile tile = this.tiles[randomLength][randomWidth];
            if (tile.isHasMine()) {
            } else {
                tile.setHasMine(true);
                placed++;
            }
        }

        //Set the number based on the mines nearby
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                int number = calculateNumber(i, j);
                tiles[i][j].setNumberAdjacentMines(number);
            }
        }
    }

    private int calculateNumber(int x, int y) {
        int numMines = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (x + i < 0 || x + i >= this.length) {
                    continue;
                }
                if (y + j < 0 || y + j >= this.width) {
                    continue;
                }
                if (tiles[x + i][y + j].isHasMine()) {
                    numMines++;
                }
            }
        }
        return numMines;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public boolean isIsDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

}
