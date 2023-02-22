package org.example.seminar3.hw1;

import org.example.seminar3.hw1.model.Items;
import java.util.List;
import java.util.ArrayList;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 * название которых содержит «высший».
 */
public class Main {
    public static void main(String[] args) {
        Items items1 = new Items("Мука высший", 90, 1);
        Items items2 = new Items("Крупа высший", 25, 2);
        Items items3 = new Items("Мука", 70, 1);
        Items items4 = new Items("Пшеница высший", 50, 1);
        Items items5 = new Items("Мука", 86, 2);
        Items items6 = new Items("Овес", 20, 2);

        List<Items> itemsList = new ArrayList<>();

        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        itemsList.add(items5);
        itemsList.add(items6);

        List<Integer> prices = new ArrayList<>();
        List<String> nameSer = new ArrayList<>();
        List<Integer> sortS = new ArrayList<>();
        String searchName = "высший";
        int max = 0;
        String tovarName="0";
        int sort =0;
        for (int i = 0; i < itemsList.size(); i++) {
            if(itemsList.get(i).getName().contains(searchName)){
                prices.add(itemsList.get(i).getPrice());
                nameSer.add(itemsList.get(i).getName());
                sortS.add(itemsList.get(i).getVariety());
                }
        }
        System.out.println(prices);
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i)>max){
                max= prices.get(i);
                tovarName=nameSer.get(i);
                sort=sortS.get(i);
                }
        }
        System.out.println("Максимальная цена = "+max+" рублей за товар: "+tovarName+" "+sort+" сорта");
    }
}
