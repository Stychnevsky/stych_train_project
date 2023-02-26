package org.example.streamAndLambdasTasks;

import java.util.ArrayList;
import java.util.List;

//    С помощью Stream создать 100 последовательных чисел (от 1 до 100),
//    все числа умножить на 2
//    и вывести в консоль только те числа остаток от деления на 5 равен нулю )
//    в итоге в консоль буду выведены 10, 20, 30 ... 200
public class task1 {
    public static void main(String[] args){
        task1();
    }
    public static void task1(){
        List<Integer> myList = new ArrayList<>();
        for (int i=1; i<=100; i++){
            myList.add(i);
            }
        myList.stream().map(x -> x * 2).filter(y -> y%5==0).forEach(System.out::println);
    }
}
