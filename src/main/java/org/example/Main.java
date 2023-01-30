package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // вывести в консоль hello world
        System.out.println("Hello world");

        // создать переменные типа int, double, boolean, long, String, int[], String[]
        // ArrayList<Integer>, HashMap<Long, String>, HashSet<String>
        int myInt;
        double myDouble;
        boolean myBool;
        long myLong;
        String myString;

        int[] myIntArray = new int[3];
        String[] myStringArray2 = new String[2];

        List<Integer> myIntArrayList = new ArrayList<>();
        Map<Long, String> myHashMap = new HashMap<>();
        Set<String> myHashSet = new HashSet<>();


        // присовить им значения и заполнить int[], String[], ArrayList<Integer>, HashMap<Long, String>, HashSet<String> данными

        myInt = 10;
        myDouble = 25.06;
        myBool = false;
        myLong = -999;
        myString = "some string";

        myIntArray[0] = 11;
        myIntArray[1] = 12;
        String[] myStringArray = {"Раз", "Два", "Три"};

        myIntArrayList.add(3);
        myIntArrayList.add(3);
        myIntArrayList.add(32);

        myHashMap.put((long) 1, "Anton");
        myHashMap.put(2L, "Misha"); // лучше L

        myHashSet.add("Anton");
        myHashSet.add("Mike");
        myHashSet.add("Mike");
        System.out.println(myHashSet);


        // Создать ArrayList<String>, заполнить значениями, и циклом вывести все значения в консоль
        // Использовать различные циклы for, for-each, while
        List<String> myStringArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            myStringArrayList.add("text#" + i);
        }
        for (String i : myStringArrayList) {
            System.out.println(i);
            // перебирать через myStringArrayList.size()
        }
    }
}