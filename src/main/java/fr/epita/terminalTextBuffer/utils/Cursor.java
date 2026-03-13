package fr.epita.terminalTextBuffer.utils;

public class Cursor {
    private int row, col;
    private int screenHeight, screenWidth;

    public Cursor(int row, int col, int screenHeight, int screenWidth) {
        this.row = row;
        this.col = col;
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        if (row < screenHeight) {
            this.row = row;
        }
    }

    public void setCol(int col) {
        if (col < screenWidth) {
            this.col = col;
        }
    }
}