import org.example.streamAndLambdasTasks.FuncInterface.StringUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//        Создать функциональный интерфейс MyFuncInterface с абстрактным методом String makeSomething(String string);
//        Создать класс StringUtil у которого будет метод public static String stringOp(String str,MyFuncInterface mfi)
//        Протестировать всю эту историю
//        Например вызвать stringOp("qwerty", .... ) и вернуть строку в верхнем регистре или приплюсовать к переданной строке какое то шаблонное значение

public class FuncInterfaceTest {
    @Test
    void testStringUtil(){
        Assertions.assertEquals(StringUtil.stringOp("qwerty", x -> x + " anton"), "qwerty anton");
    }
}
