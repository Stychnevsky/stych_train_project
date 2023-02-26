package org.example.streamAndLambdasTasks.FuncInterface;

public class StringUtil{
    public static String stringOp(String str, MyFuncInterface mfi){
        return mfi.makeSomething(str);
    }
}
