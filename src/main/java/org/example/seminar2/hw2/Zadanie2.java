package org.example.seminar2.hw2;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел.
 * Верно ли, что последовательность является возрастающей.
 */
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество N целых чисел: ");
        int n = scanner.nextInt();
        System.out.println("Целые числа: ");
        int [] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        boolean result = true;
        for (int i = 0; i < n-1; i++) {
            if(mass[i]<mass[i+1]){
                result = true;
            }
            else {
                result = false;
            }
        }
        scanner.close();
        if (result==true){
            System.out.println("Последовательность возрастающая!");
        }
        if (result==false){
            System.out.println("Последовательность НЕ возрастающая!");
        }
    }
}
