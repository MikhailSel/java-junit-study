package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BoxTest {

    private Box box;

    @BeforeEach
    void beforeEach() {
        this.box = new Box();
    }

    @Test
    void addSuccess() {
        //GIVEN
        //WHEN
        String result = box.add("Яблоко");
        //THEN
        Assertions.assertEquals("Яблоко", result);
        List<String> resultList = new ArrayList<>();
        resultList.add(result);
        Assertions.assertEquals(box.getThingList(), resultList);
    }

    @Test
    void removeRandomThingSuccess() {
        //GIVEN
        String thing1 = box.add("Яблоко");
        String thing2 = box.add("Помидор");
        String thing3 = box.add("Арбуз");

        List<String> beforeRemoveList = new ArrayList<>();
        beforeRemoveList.add(thing1);
        beforeRemoveList.add(thing2);
        beforeRemoveList.add(thing3);

        //WHEN
        String result = box.removeRandomThing();
        //THEN
        Assertions.assertTrue(beforeRemoveList.contains(result));
        Assertions.assertFalse(box.getThingList().contains(result));
    }

    @Test
    void shuffleThingSuccess() {
        //GIVEN
        String thing1 = box.add("Яблоко");
        String thing2 = box.add("Помидор");
        String thing3 = box.add("Арбуз");

        List<String> beforeShuffleList = new ArrayList<>();
        beforeShuffleList.add(thing1);
        beforeShuffleList.add(thing2);
        beforeShuffleList.add(thing3);
        //WHEN
        box.shuffleThing();
        //THEN
        Assertions.assertNotEquals(beforeShuffleList, box.getThingList());
    }

}
