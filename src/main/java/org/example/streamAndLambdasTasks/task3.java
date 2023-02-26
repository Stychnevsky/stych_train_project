package org.example.streamAndLambdasTasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

//    Создать ArrayList<Integer> заполнить рандомными значениями
//        отсортировать с помощью метода sort
//        сделать в трех вариантах:
//        - с помощью лямбды
//        - с помощью аннонимного класса
//        - с помощью созданного класса реализующего Comparator
public class task3 {
    public static void main(String[] args) {
        System.out.println(sortByAnonymousClass());
        System.out.println(sortByLambda());
        System.out.println(sortByCreatedClass());
    }

    public static ArrayList<Integer> createArrayList(){
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i<10; i++){
            list.add(rand.nextInt());
        }
        return list;
    }
    static ArrayList<Integer> defaultList = createArrayList();


    public  static ArrayList<Integer> sortByAnonymousClass(){
        ArrayList<Integer> myList = defaultList;
        myList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        return myList;
    }
    public static ArrayList<Integer> sortByLambda(){
        ArrayList<Integer> myList = defaultList;
        myList.sort((Integer int1, Integer int2) -> int1.compareTo(int2));
        return myList;
    }

    public static ArrayList<Integer> sortByCreatedClass(){
        ArrayList<Integer> myList = defaultList;
        myList.sort(new MyIntegerComparator());
        return myList;
    }
}
