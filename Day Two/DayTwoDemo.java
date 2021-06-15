/**
 *  Create a class named Poem that contains fields for the name of the poem and
 *  the number of lines in it. Include a constructor that requires values for both
 *   fields. Also include get methods to retrieve field values. Create three subclasses:
 *   Couplet , Limerick , and Haiku . The constructor for each subclass requires only
 *   a title; the lines field is set using a constant value. A couplet has two lines, a
 *   limerick has five lines, and a haiku has three lines. Create an application that
 *   demonstrates usage of an object of each type. Save the files as Poem.java,
 *   Couplet.java, Limerick.java, Haiku.java, and DemoPoems.java.
 */

package com.java30days;

public class DayTwoDemo {
    public static void main(String[] args) {
        Poem p1 = new Poem("Twinkle Twinkle Little Star", 16);
        System.out.println("The Poem name is " + p1.getName() + " and it has " + p1.getNumberOfLines() + " limes");

        Couplet p2 = new Couplet("Rain Rain Go Away");
        System.out.println("The Poem name is " + p2.getName() + " and it has " + p2.getNumberOfLines() + " lines");

        Limerick p3 = new Limerick("Johny Johny Yes Papa");
        System.out.println("The Poem name is " + p3.getName() + " and it has " + p3.getNumberOfLines() + " lines");

        Haiku p4 = new Haiku("Butterflies are cool");
        System.out.println("The Poem name is " + p4.getName() + " and it has " + p4.getNumberOfLines() + " lines");
    }

}
