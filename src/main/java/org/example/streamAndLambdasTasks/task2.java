package org.example.streamAndLambdasTasks;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

//        С помощью Stream сгенерить 250 рандомных чисел от 0 до 50000,
//        преобразовать каждое число в строку,
//        отфильтровать по длине строки < 4
//        и вернуть List<String>
public class task2 {
    public static void main(String[] args) {
        System.out.println(task2());
    }

    public static List<String> task2() {
        Integer[] myArray = new Integer[250];;
        Random rand = new Random();
        final int BOUND = 50000;
        Stream<Integer> randomStream = Stream.of(myArray).map(x -> rand.nextInt(BOUND));
        List<String> myNewList = randomStream.map(Object::toString).filter(x -> x.length() < 4).toList();
        return myNewList;
    }
}
