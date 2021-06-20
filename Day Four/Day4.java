package com.chawerkamanga;

import java.util.*;

public class Day4 {
    public static void main(String[] args) {
        // Demo for array list
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // Traverse the array list forward
        System.out.println("Traversing all elements of the array list forwards");
        for(int num: arrayList)
            System.out.print(num + " ");
        System.out.println();

        // Traverse the list backwards
        System.out.println("Traversing all elements of the array list backwards");
        ListIterator<Integer> arrayListIterator = arrayList.listIterator();
        arrayListIterator = arrayList.listIterator(arrayList.size());
        while (arrayListIterator.hasPrevious())
            System.out.print(arrayListIterator.previous() + " ");
        System.out.println();

        // Demo for LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Lusaka");
        linkedList.add("Harare");
        linkedList.add("Lilongwe");
        linkedList.add("Dodoma");

        // Traverse the Linked List forward
        System.out.println();
        System.out.println("Traversing all elements of linked list forward");
        linkedList.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // Traverse the Linked List Backward
        System.out.println("Traversing all elements of linked list backward");

        ListIterator<String>linkedListIterator = linkedList.listIterator();
        linkedListIterator = linkedList.listIterator(linkedList.size());
        while (linkedListIterator.hasPrevious())
            System.out.print(linkedListIterator.previous() + " ");
        System.out.println();
    }
}
