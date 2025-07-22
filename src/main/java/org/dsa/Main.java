package org.dsa;

import org.dsa.linkedlist.InsertAtEndOptimized;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InsertAtEndOptimized insertAtEndOptimized = new InsertAtEndOptimized();
        Scanner scanner = new Scanner(System.in);
        Integer noOfItems = scanner.nextInt();
        for(int i = 0; i< noOfItems; i++){
            insertAtEndOptimized.insertAtEnd(scanner.nextInt());
        }

        insertAtEndOptimized.printValues();
    }
}