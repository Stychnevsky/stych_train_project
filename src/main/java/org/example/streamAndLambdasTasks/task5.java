package org.example.streamAndLambdasTasks;

import java.util.ArrayList;

//        Создать ArrayList<String> добавить туда любые значение например "one", "two", "three"
//        и с помощью стрима преобразовать в строку вида "{one, two, three}"
public class task5 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        String listInStringStyle = myList.stream().reduce("{", (partialString, element) ->
                partialString + element + ", ");
        listInStringStyle = listInStringStyle.substring(0, listInStringStyle.length() - 2) + "}";
        System.out.println(listInStringStyle);
    }
}
