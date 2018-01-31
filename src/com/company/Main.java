package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[] masyvas;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        masyvas = new String[5];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite zodi");
            String zodis = sc.nextLine();
            masyvas[i] = zodis;
        }
        atvaizdavimas();
    }
    public static void atvaizdavimas() {
        System.out.println("visi zodziai ");
        for (int i = 0; i <masyvas.length; i++) {
            System.out.print(masyvas[i]+ " ");

        }
    }
}
