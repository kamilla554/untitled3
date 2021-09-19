package com.company;

public class Circle {
    int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public float area(int r){
        return (float) (r*r*Math.PI);
    }
}
