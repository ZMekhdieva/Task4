package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input binary number: ");
        String b = in.nextLine();
        int dec = Integer.parseInt(b, 2);
        System.out.println("Decimal: " + dec);

    }
}
