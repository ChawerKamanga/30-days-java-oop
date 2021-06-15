package com.java30days;

public class Poem {
    private String name;
    private int numberOfLines;

    // This constructor is not part of the question
    public Poem(){}

    public Poem(String name, int numberOfLines) {
        this.name = name;
        this.numberOfLines = numberOfLines;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLines() {
        return numberOfLines;
    }
}
