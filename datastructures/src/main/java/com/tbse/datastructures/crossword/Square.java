package com.tbse.datastructures.crossword;

import android.graphics.Color;

public class Square {

    public int color; // 0 is black, 1 is white
    public boolean hasBeenVisited = false;
    public int[] coords;

    public Square(int c) {
        color = c;
    }



}
