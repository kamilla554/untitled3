package com.company;

public class Hand  {
    boolean right;
    boolean left;

    public Hand(boolean right, boolean left) {
        this.right = right;
        this.left = left;
    }

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
        if (right)
        {
            temp="Right leg is okay, ";
        }
        else
        {
            temp="Right leg needs help, ";
        }
        if (left)
        {
            temp=temp +"left leg is okay.";
        }
        else
        {
            temp=temp+"left leg needs help.";
        }
        return temp;
    }
}
