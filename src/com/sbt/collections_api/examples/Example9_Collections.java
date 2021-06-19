package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;

import java.util.*;

public class Example9_Collections {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        System.out.println("-1.-------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов

        System.out.println("-2.-------------------------------");
        // отсортируйте содержимое в естественном порядке вызовом Collections.sort(List)
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов

        System.out.println("-3.-------------------------------");
        // обратите порядок клиентов вызовом Collections.reverse(List)
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов

        System.out.println("-4.-------------------------------");
        // отсортируйте содержимое по телефонным номерам вызовом Collections.sort(List, Comparator)
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов


        System.out.println("-5.-------------------------------");
        // выведите минимальный по естественному порядку элемент вызовом Collections.min(List)
        // и максимальный по индексу элемент вызовом Collections.max(List, Comparator)


    }
}
