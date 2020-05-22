package com.company;

public interface TextStore {
    long store(String text);
    String get(long id);
}
