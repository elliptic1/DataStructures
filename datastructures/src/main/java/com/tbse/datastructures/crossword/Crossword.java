package com.tbse.datastructures.crossword;

import android.graphics.Color;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Crossword {

    int n; // dimension of puzzle
    Square[][] squares;

    public boolean checkAreAllConnected() {

        ArrayDeque<Square> toBeVisited = new ArrayDeque<Square>();

        int numberOfWhiteSquaresFound = 0;

        if (squares[0][0].color == Color.WHITE) {
            toBeVisited.addLast(squares[0][0]);
            squares[0][0].hasBeenVisited = true;
            ++numberOfWhiteSquaresFound;
        }

        // O(n)
        while (toBeVisited.size() > 0) {
            Square s = toBeVisited.removeFirst();
            for (Square ns : getNeighbors(s)) {
                if (ns.hasBeenVisited == false &&
                        ns.color == Color.WHITE) {
                    toBeVisited.addLast(ns);
                    ns.hasBeenVisited = true;
                    ++numberOfWhiteSquaresFound;
                }
            }

        }

        return numberOfWhiteSquaresFound == getNumberOfWhiteSquares();

    }

    // O(n)
    private int getNumberOfWhiteSquares() {
        int num = 0;
        for (Square[] row : squares) {
           for (Square s : row) {
               if (s.color == Color.WHITE) {
                   ++num;
               }
           }
        }
        return num;
    }

    public ArrayList<Square> getNeighbors(Square s){
        // Assuming puzzle is nxn

        ArrayList<Square> neighbors = new ArrayList<Square>();

        if (s.coords[0] == 0 && s.coords[1] == 0) {
            neighbors.add(squares[0][1]);
            neighbors.add(squares[1][0]);
        } else

        if (s.coords[0] == n-1 && s.coords[1] == 0) {
            neighbors.add(squares[n-2][0]);
            neighbors.add(squares[n-1][1]);
        } else

        if (s.coords[0] == n-1 && s.coords[1] == n-1) {
            neighbors.add(squares[n-1][n-2]);
            neighbors.add(squares[n-2][n-1]);
        } else

        if (s.coords[0] == 0 && s.coords[1] == n-1) {
            neighbors.add(squares[0][n-2]);
            neighbors.add(squares[1][n-1]);
        } else

        // top
        if (s.coords[0] == 0) {
            neighbors.add(squares[0][s.coords[1]-1]);
            neighbors.add(squares[1][s.coords[1]]);
            neighbors.add(squares[0][s.coords[1]+1]);
        }

        // left
        if (s.coords[1] == 0) {
            neighbors.add(squares[s.coords[0]-1][0]);
            neighbors.add(squares[s.coords[0]][1]);
            neighbors.add(squares[s.coords[0]+1][0]);
        }

        // right
        if (s.coords[1] == n-1) {
            neighbors.add(squares[s.coords[0]-1][n-1]);
            neighbors.add(squares[s.coords[0]][n-2]);
            neighbors.add(squares[s.coords[0]+1][n-1]);
        }

        // bottom
        if (s.coords[0] == n-1) {
            neighbors.add(squares[n-1][s.coords[0]-1]);
            neighbors.add(squares[n-2][s.coords[0]]);
            neighbors.add(squares[n-1][s.coords[0]+1]);
        }

        return neighbors;
    }

    // assume this was called
    public void setSquares(Square[][] squares) {
        this.squares = squares;
    }

    public Square[][] getSquares() {
        return squares;
    }
}
