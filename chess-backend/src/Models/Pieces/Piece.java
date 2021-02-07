package Models.Pieces;

import java.util.ArrayList;

public abstract class Piece
{

    private int[] initialPosition;
    private int[] currentPosition;
    private String color;
    private String name;
    private String initial;
    private ArrayList<Object> moves;

    public Piece(int[] pos, String color, String name, String initial) {
        this.initialPosition = this.currentPosition = pos;
        this.color = color;
        this.name = name;
        this.initial = initial;
    }

    // setters
    public void setInitialPosition(int x, int y) {
        this.initialPosition[0] = x;
        this.initialPosition[1] = y;
    }
    public void setCurrentPosition(int x, int y) {
        this.currentPosition[0] = x;
        this.currentPosition[1] = y;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setInitial(String initial) {
        this.initial = initial;
    }

    // getters
    public int[] getInitialPosition() {
        return this.initialPosition;
    }
    public int[] getCurrentPosition() {
        return this.currentPosition;
    }
    public String getColor() {
        return this.color;
    }
    public String getName() {
        return this.name;
    }
    public String getInitial() {
        return this.initial;
    }

    // move methods
    public abstract void move();
}
