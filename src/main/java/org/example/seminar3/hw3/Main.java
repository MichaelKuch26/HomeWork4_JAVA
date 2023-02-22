package org.example.seminar3.hw3;

import org.example.seminar3.hw3.model.Items;
import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания
 * и количества страниц. Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Main {
    public static void main(String[] args) {
        Items book1 = new Items("Оно", "Кинг", 1000, 2020, 2500);
        Items book2 = new Items("Игра престолов", "Мартин", 1100, 1996, 800);
        Items book3 = new Items("Шерлок Холмс", "Дойл", 700, 2012, 200);
        Items book4 = new Items("Зов Ктулху", "Лавкрафт", 500, 2010, 151);
        Items book5 = new Items("Война миров", "Уэйлс", 600, 1931, 300);
        Items book6 = new Items("Капитал", "Маркс", 800, 2023, 4500);

        List<Items> allBooks = new ArrayList<>();

        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
        allBooks.add(book5);
        allBooks.add(book6);

        List<String> nameSer = new ArrayList<>();
        List<Integer> pageSer = new ArrayList<>();
        List<String> surSer = new ArrayList<>();
        List<Integer> yearSer = new ArrayList<>();

        String searchName = "а";

        String nameAut = "0";
        int page = 0;
        String surName = "0";
        int year = 0;

        for (int i = 0; i < allBooks.size(); i++) {
            if(allBooks.get(i).getSurname().contains(searchName)){
                nameSer.add(allBooks.get(i).getName());
                pageSer.add(allBooks.get(i).getPages());
                surSer.add(allBooks.get(i).getSurname());
                yearSer.add(allBooks.get(i).getYear());
            }
        }
        for (int i = 0; i < yearSer.size(); i++) {
            if (yearSer.get(i)>=2010){
                for (int j = 0; j < pageSer.size(); j++) {
                    int x = 0;
                    x = pageSer.get(i);
                    if(x>1 && x%1==0 && x%x==0 && x%2!=0){
                        if (x%3!=0) {
                            if (x%5!=0){
                                page = x;
                                year = yearSer.get(i);
                                surName = nameSer.get(i);
                                nameAut = surSer.get(i);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Название книги: "+surName+" , Автор: "+nameAut+" ,\n Количество страниц: "+page+" , Год издания, "+year);
    }
}
