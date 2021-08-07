package com.headfirst.singleton;


public class SingletonClient {

    public static void main(String[] args) {
        Singletons singletons = Singletons.UNIQUE_INSTANCE;
        //use the single instance here
    }
}
