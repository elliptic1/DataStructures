package com.tbse.datastructures.binary_search_tree;

import android.provider.MediaStore;
import android.util.Log;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Deque;

public class BSTNode {

   BSTNode left;
   public int data;
   BSTNode right;
   public static ArrayDeque<BSTNode> nodes = new ArrayDeque<BSTNode>();

    public BSTNode(){ data = 0; }

    public BSTNode(int a) {
        data = a;
    }

    // running time? O(ln n)
    private boolean contains(int c) {
        if (data == c) return true;
        if (c < data) {
            if (left == null) {
                return false;
            } else {
                left.contains(c);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                right.contains(c);
            }
        }
        return false;
    }

    private boolean testContains() {

        BSTNode myNode = new BSTNode(8);
        myNode.insert(1);
        myNode.insert(4);

        return contains(4);

    }

    // running time ln(n) (not that n)
    public void insert(int n) {
        if (n > data) {

            if (right == null) {
                right = new BSTNode(n);
            } else {
                right.insert(n);
            }

        } else if (n < data) {

            if (left == null) {
                left = new BSTNode(n);
            } else {
                left.insert(n);
            }

        }

    }

    private boolean testInsert() {

        BSTNode myNode = getNiceBSTNode();
        return myNode.contains(8);

    }


    // O(n)
    public void depthTraverse() {
        Log.d("ds", " "+data); // preorder


        if (left != null) {
            left.depthTraverse();
        }

        if (right != null) {
            right.depthTraverse();
        }

    }



    // O(ln n)
    public int search(int o) {

       if (data == o) {
           Log.d("ds", "data is " + o);
           return data;
       } else if (o < data) {
           if (left == null) {
               return Integer.MIN_VALUE;
           } else {
               Log.d("ds", "going left");
               left.search(o);
           }
       } else {
           if (right == null) {
               return Integer.MIN_VALUE;
           } else {
               Log.d("ds", "going right");
               right.search(o);
           }
       }

       return Integer.MIN_VALUE;

    }

    // O(n)
    public void breadthTraverse() {
        Log.d("ds", " "+data);

        if (left != null) {
            nodes.addFirst(left);
        }
        if (right != null) {
            nodes.addFirst(right);
        }

        if (nodes.size() > 0) {
            nodes.removeLast().breadthTraverse();
        }

    }



//              5
//           3 --- 8
//          2-4   6-9
//
//     bf: 5 3 8 2 4 6 9
//     df: 5 3 2 4 8 6 9

    public static BSTNode getNiceBSTNode() {
        BSTNode myNode = new BSTNode(5);
        myNode.insert(3);
        myNode.insert(8);
        myNode.insert(2);
        myNode.insert(4);
        myNode.insert(6);
        myNode.insert(9);

        return myNode;
    }

    private boolean testSearch() {

       BSTNode myNode = getNiceBSTNode();
       return myNode.search(4) == 4;

    }

    public BSTNode getMin() {
        if (left == null) {
            return this;
        }
        return left.getMin();
    }


    private boolean testGetMin() {

        BSTNode myNode = new BSTNode(8);
        myNode.insert(1);
        myNode.insert(7);
        myNode.insert(4);
        myNode.insert(9);
        myNode.insert(91);

        return myNode.getMin().data == 1;

    }



}



