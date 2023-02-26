package org.example.streamAndLambdasTasks;

import java.util.Comparator;

public class MyIntegerComparator implements Comparator<Integer> {
    public int compare(Integer int1, Integer int2){
        if (int1 > int2){
            return 1;
        } else if (int1.equals(int2)) {
            return 0;
        } else {
            return -1;
        }
    }
}
