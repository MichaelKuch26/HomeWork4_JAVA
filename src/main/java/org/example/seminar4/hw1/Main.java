package org.example.seminar4.hw1;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1->2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class Main {
    public static void main(String[] args) {
        LinkedList <Integer> myList = new LinkedList<>(Arrays.asList(1,2,3,4));
        LinkedList <Integer> revList = new LinkedList<>(Arrays.asList());
        for (int i = myList.size()-1; i >=0; i--) {
            revList.add(myList.get(i));
        }
        System.out.println("Изначальный список = "+myList);
        System.out.println("Перевернутый список = "+revList);
    }
}
