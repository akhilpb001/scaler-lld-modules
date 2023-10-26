package com.scaler.lldmodule2.designpatterns.creational.prototypeandregistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> registry = new HashMap<>();

    public void add(String key, Student st) {
        registry.put(key, st);
    }

    public Student get(String key) {
        return registry.get(key);
    }

}
