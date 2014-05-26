package com.tbse.datastructures.red_black_trees;

import android.graphics.Color;
import android.widget.CompoundButton;

import com.tbse.datastructures.binary_search_tree.BSTNode;

// The root and leaves are black.
// Every red node has a black parent.
// All simple paths from a node x to a descendant leaf have the same number of black nodes

public class RBNode extends BSTNode {

    RBNode left;
    RBNode right;

    private int color = Color.BLACK;

    public void setColor(int c) {
        color = c;
    }

    public int getColor() {
        return color;
    }

    public int getBlackHeight() {

        int blackHeight = 0;

        blackHeight += left.getBlackHeight();

        return blackHeight;

    }

}
