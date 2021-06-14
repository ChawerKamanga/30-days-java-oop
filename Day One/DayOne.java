package com.java30days;

interface Herbivore {
    void eatGrass();
}

interface Carnivore {
    void eatMeat();
}

class Omnivore implements Herbivore, Carnivore{
    @Override
    public void eatMeat() {
        System.out.println("I am an Omnivore therefore I eat meat");
    }

    @Override
    public void eatGrass() {
        System.out.println("I am an Omnivore therefore I eat vegetables");
    }
}

public class DayOne {
    public static void main(String[] args) {
        var omnivore = new Omnivore();
        omnivore.eatGrass();
        omnivore.eatMeat();
    }
}
