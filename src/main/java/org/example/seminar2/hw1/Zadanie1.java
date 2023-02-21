package org.example.seminar2.hw1;

import java.util.Scanner;

/**
 *Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество N целых чисел: ");
        int n = scanner.nextInt();
        System.out.println("Целые числа: ");
        int [] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        int sumSimpleNum = 0;
        int fs = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (mass[i]==2){
                fs = 2;
            }
            if(mass[i]>1 && mass[i]%1==0 && mass[i]%mass[i]==0 && mass[i]%2!=0){
                if (mass[i]%3!=0) {
                    if (mass[i]%5!=0){
                        sumSimpleNum+=mass[i];
                    }
                }
            }
        }
        scanner.close();
        result = sumSimpleNum + fs;
        System.out.println("Сумма простых числе равняется: "+result);
    }
}