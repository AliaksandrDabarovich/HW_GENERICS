package com.epam.generics;

import com.epam.generics.entity.Mark;
import com.epam.generics.entity.OnlyMark;
import com.epam.generics.entity.PersonalList;
import com.epam.generics.repository.NumberComparator;

public class Runner {
    public static void main(String[] args) {
//        Mark<String, String> mark1 = new Mark<>("Math", "5");
//        Mark<String, Integer> mark2 = new Mark<>("Biology", 10);
//        System.out.println(mark1);
//        System.out.println(mark2);
//
//
//        PersonalList<Integer> personalList = new PersonalList<>();
//        personalList.add(5);
//        personalList.add(1);
//        personalList.add(20);
//
//        personalList.print();
//
//        personalList.sort(new NumberComparator());
//        personalList.print();

        PersonalList<OnlyMark<Integer>> markList = new PersonalList <OnlyMark<Integer>>();
        markList.add(new OnlyMark<Integer>(5));
        markList.add(new OnlyMark<Integer>(1));
        markList.add(new OnlyMark<Integer>(0));

        markList.print();
        markList.sort(new NumberComparator());
        markList.print();


    }
}
