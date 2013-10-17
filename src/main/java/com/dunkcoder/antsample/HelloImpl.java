package com.dunkcoder.antsample;

public class HelloImpl implements IHello {

    @Override
    public String hello(String to) {
        return "Hello to " + to;
    }
}