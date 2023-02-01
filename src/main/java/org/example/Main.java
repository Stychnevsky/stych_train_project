package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        firstSimpleTasks();

        System.out.println("\nМетод для проверки длинны строки больше/меньше 5");
        System.out.println(checkStringLength(new String[]{"ant", "gg", "goal"}));
        System.out.println(checkStringLength(new String[]{"ant", "gg", "goal", "2", "33", "2"}));

        System.out.println("\nМетод для проверки чисел от -100 до 100; при 0 бросаем исключение");
        checkNumberSign(9);
        // checkNumberSign(0);

        System.out.println("\n\nМетод для заполнения HashMap и вывода только четных значений");
        createAndCheckHashMap();
    }
    public static void firstSimpleTasks() {
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
        myIntArray[2] = 13;
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
        System.out.println("\nСоздание и вывод ArrayList через for-each");
        List<String> myStringArrayList = new ArrayList<>();
        final int ARRAY_SIZE = 4;
        for (int i = 0; i < ARRAY_SIZE; i++) { // перебирать через myStringArrayList.size()
            myStringArrayList.add("text#" + (i + 1));
        }
        for (String i : myStringArrayList) {
            System.out.println(i);
        }

        System.out.println("\nВывод ArrayList через while");
        int counter = 0;
        while (counter < myStringArrayList.size()) {
            System.out.println(myStringArrayList.get(counter));
            counter++;
        }


    }
    // Написать метод которые принимает строку и возвращает true если длинна строки больше 5 символов, иначе false
    public static boolean checkStringLength(String[] inputString) {
        final int LENGTH_THRESHOLD = 5;
        if (inputString.length > LENGTH_THRESHOLD) {
            return true;
        }
        return false;
    }

    // Написать метод который принимает int если значение в диапазоне от 1 до 100 то выводит в консоль это число,
    // если значение в диапазоне от -1 до - 100 то выводить строку "Значение меньше нуля"
    // если значение равно нулю то бросает исключение RuntimeException с текстом "Значение не может быть равно нулю"
    public static void checkNumberSign(int inputNumber) {
        if (1 < inputNumber && inputNumber < 100) {
            System.out.println(inputNumber);
        } else if (-100 < inputNumber && inputNumber < -1) {
            System.out.println("Значение меньше нуля");
        } else if (inputNumber == 0) {
            throw new RuntimeException("Значение не может быть равно нулю");
        } else {
            throw new RuntimeException("Введите значение от -100 до 100");
        }
    }

    // Создать HashMap<String, Long> заполнить значениями
    // в цикле вывести в консоль только те значения в которые value четное число`
    public static void createAndCheckHashMap() {
        Map<String, Long> myHashMap = new HashMap<>();
        String[] keysList = new String[]{"Антон", "Вася", "Игорь", "Егор", "Петя"};
        Random rand = new Random();
        final int UPPERBOUND = 100;
        for (String key: keysList) {
            long value = rand.nextLong(UPPERBOUND);
            myHashMap.put(key, value);
            System.out.println("Ключу " + key + " присвоено значение " + value);
        }
        System.out.println("\n\nЛюди с нечетными цифрами:");
        for (String key: myHashMap.keySet()){
            if (myHashMap.get(key) % 2 == 0) {
                System.out.println("Ключ: " + key + "; Значение: " + myHashMap.get(key));
            }
        }
    }
}