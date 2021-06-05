
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        int answer = 0;
        int firstNum = 0, secNum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first number? ");
        firstNum = scanner.nextInt();

        System.out.println("What is the first number? ");
        secNum = scanner.nextInt();

        answer = firstNum + secNum;
        System.out.println(firstNum + " + " + secNum + " = " + answer );

        answer = firstNum - secNum;
        System.out.println(firstNum + " - " + secNum + " = " + answer );

        answer = firstNum * secNum;
        System.out.println(firstNum + " x " + secNum + " = " + answer );

        answer = firstNum / secNum;
        System.out.println(firstNum + " / " + secNum + " = " + answer );
    }
}