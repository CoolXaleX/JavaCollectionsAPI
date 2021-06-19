package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;
import com.sbt.collections_api.Segment;

import java.util.*;

public class Example2_ArrayList {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        System.out.println("-1.-------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов

        System.out.println("-2.-------------------------------");
        // выведите элемент ArrayList с индексом 5

        System.out.println("-3.-------------------------------");
        // проверьте наличие в ArrayList клиента new Person(10L, "Бирюков Виктор Валерьевич", "79185551234", Segment.MASS)

        System.out.println("-4.-------------------------------");
        // проверьте наличие в ArrayList клиента new Person(20L, "Египетская Зина Кукринкинович", "79185551237", Segment.MASS)

        System.out.println("-5.-------------------------------");
        // выведите индекс в ArrayList клиента new Person(7L, "Павлов Иван Геннадьевич", "79185551228", Segment.MASS)

        System.out.println("-6.-------------------------------");
        // отстортируйте клиентов в ArrayList по ФИО и выведите результат

        System.out.println("-7.-------------------------------");
        // устраните из ArrayList всех клиентов из сегмента Segment.MASS и выведите результат

        System.out.println("-8.-------------------------------");
        // Попробуйте получить элемент ArrayList с несуществующим индексом (например, 100), проанализируйте результат
    }
}
