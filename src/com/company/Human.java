package com.company;

public class Human {
    Leg leg = new Leg(true, false);
    Hand hand = new Hand(true,true);
    Head head = new Head(false);

    @Override
    public String toString() {
        return "Human{" +
                "leg:"+leg.toString()+
                ", hand=" + hand.toString() +
                ", head=" + head.toString() +
                '}';
    }
}
