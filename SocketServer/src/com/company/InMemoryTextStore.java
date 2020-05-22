package com.company;

import java.util.HashMap;
import java.util.Map;

public class InMemoryTextStore implements TextStore {

    Map<Long,String> map = new HashMap();
    long nextIndex = 1;


    public long store(String text) {
        map.put(nextIndex, text);
        return nextIndex++;
    }


    public String get(long id) {
        return map.get(id);
    }
}
