package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Box {

    private List<String> thingList = new ArrayList<>();

    public String add(String thing) {
        thingList.add(thing);
        return thing;
    }

    public String removeRandomThing() {
        Random random = new Random();
        int listSize = thingList.size();
        int index = random.nextInt(listSize);
        String result = thingList.remove(index);
        return result;
    }

    public void shuffleThing() {
        Collections.shuffle(thingList);
    }

    public List<String> getThingList() {
        return thingList;
    }
}

