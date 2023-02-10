
import org.example.oop.family.*;
import org.example.oop.sport.Box;
import org.example.oop.sport.Crossfit;
import org.example.oop.sport.Football;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FamilyTest {
    Family testFamily = createFamily();


    public static Family createFamily() {
        Man husband = new Man("Anton", "Stychnevskiy", 26);
        Woman wife = new Woman("Marta", "Grishina", 30);
        Child child1 = new Girl("Vika", "Stychnevskaya", 9);
        Child child2 = new Boy("Tolik", "Stychnevskiy", 5);
        Child child3 = new Boy("Misha", "Stychnevskiy", 2);
        ArrayList<Child> childrenList = new ArrayList<>();
        childrenList.add(child1);
        childrenList.add(child2);
        childrenList.add(child3);
        return new Family(husband, wife, childrenList);
    }
    @Test
    void testGoToRomanticTrip(){
        final String expected = "Успешное путешествие";
        String actualResult = this.testFamily.goToTrip(this.testFamily.husband, this.testFamily.wife);
        Assertions.assertEquals(actualResult, expected);
    }

    @Test
    void testGoToDisneyTrip(){
        final String expected = "Успешное путешествие в Дисней";
        String actualResult = this.testFamily.goToTrip(this.testFamily.husband, this.testFamily.wife, this.testFamily.children);
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void TestGoToTripWithoutHusband(){
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Man lover = new Man("Adriano", "Celentano", 85);
            this.testFamily.goToTrip(lover, this.testFamily.wife);
        });
    }

    @Test
    void testBoyEat(){
        final String expected = "Мальчик покушал";
        Boy boy = new Boy("Tolik", "Stychnevskiy", 5);
        String actualResult = boy.eat();
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void testAddStrengthByBox(){
        final int expectedStrength = 2;
        Box box = new Box();
        Man man = new Man("Anton", "Stychnevskiy", 26);
        Assertions.assertEquals(0, man.getStrength());
        man.makeSport(box);
        Assertions.assertEquals(expectedStrength, man.getStrength());
    }

    @Test
    void testChildTryDoCrossfit(){
        Football football = new Football();
        Crossfit crossfit = new Crossfit();
        Boy boy = new Boy("Vitya", "Korolev", 12);
        boy.makeSport(football);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            boy.makeSport(crossfit);
        });

        String expectedMessage = "Ребенок не может заниматься кроссифтом";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}



