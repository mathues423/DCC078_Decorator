package main;

public class PopUP {

    private int top_left;
    private int bottle_right;

    public PopUP(int top_left, int bottle_right) {
        this.top_left = top_left;
        this.bottle_right = bottle_right;
    }

    public int getTop_left() {
        return top_left;
    }

    public void setTop_left(int top_left) {
        this.top_left = top_left;
    }

    public int getBottle_right() {
        return bottle_right;
    }

    public void setBottle_right(int bottle_right) {
        this.bottle_right = bottle_right;
    }
}
