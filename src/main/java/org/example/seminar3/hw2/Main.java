package org.example.seminar3.hw2;

import org.example.seminar3.hw2.model.Items;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Main {
    public static void main(String[] args) {
        Items product1 = new Items("Мыло", "Аргентина", 0.5, 119, 1);
        Items product2 = new Items("Перец", "Индия", 1.0, 70, 2);
        Items product3 = new Items("Железо", "Россия", 1.0, 79, 2);
        Items product4 = new Items("Бумага оф.", "Китай", 2.0, 100, 1);
        Items product5 = new Items("Стекло", "Венгрия", 1.0, 69, 3);
        Items product6 = new Items("Древесина", "Китай", 1.0, 140, 3);
        Items product7 = new Items("Ткань", "Узбекистан", 2.0, 30, 1);

        List<Items> allProduct = new ArrayList<>();

        allProduct.add(product1);
        allProduct.add(product2);
        allProduct.add(product3);
        allProduct.add(product4);
        allProduct.add(product5);
        allProduct.add(product6);
        allProduct.add(product7);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товара(1-3): ");
        int variety = scanner.nextInt();
        int search = variety;
        scanner.close();

        List<Integer> prices = new ArrayList<>();
        List<String> nameSer = new ArrayList<>();
        List<Integer> sortS = new ArrayList<>();

        String tovarName = "0";
        int sort = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < allProduct.size(); i++) {
            if (allProduct.get(i).getVariety().equals(search)) {
                prices.add(allProduct.get(i).getPrice());
                nameSer.add(allProduct.get(i).getName());
                sortS.add(allProduct.get(i).getVariety());
                }
            }
        for (int i = 0; i < prices.size(); i++){
            if (min > prices.get(i)) {
                min = prices.get(i);
                tovarName = nameSer.get(i);
                sort = sortS.get(i);
                }
            }
        System.out.println("Минимальная цена = "+min+" рублей за товар: "+tovarName+" "+sort+" сорта");
    }
}
