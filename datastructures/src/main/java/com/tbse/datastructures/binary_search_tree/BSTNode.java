package com.tbse.datastructures.binary_search_tree;

public class BSTNode {

   BSTNode left;
   int data;
   BSTNode right;

    BSTNode(int a) {
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
    }

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

    private testInsert() {

    }

    private BSTNode search(int o) {

       if (data == o) {
           return this;
       } else if (o < data) {
           if (left == null) {
               return null;
           } else {
               left.search(o);
           }
       } else {
           if (right == null) {
               return null;
           } else {
               right.search(o);
           }
       }

       return null;

    }

    private BSTNode getMin() {
        if (left == null) {
            return this;
        }
        return left;
    }


    private testGetMin() {

    }



}



