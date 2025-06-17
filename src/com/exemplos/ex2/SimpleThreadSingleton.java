package com.exemplos.ex2;

public final class SimpleThreadSingleton {
    private static SimpleThreadSingleton instance;
    public String value;

    private SimpleThreadSingleton(String value) {
        this.value = value;
    }

    public static SimpleThreadSingleton getInstance(String value){
        if (instance == null){
            instance = new SimpleThreadSingleton(value);
        }
        return instance;
    }

}
