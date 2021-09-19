package com.company;

public class Leg {
    boolean right;
    boolean left;

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    @Override
    public String toString() {
        String temp;
        if (right == true)
        {
            temp="Right hand is okay, ";
        }
        else
        {
            temp="Right hand needs help, ";
        }
        if (left == true)
        {
            temp=temp +"left hand is okay.";
        }
        else
        {
            temp=temp+"left hand needs help.";
        }
        return temp;
    }
}
