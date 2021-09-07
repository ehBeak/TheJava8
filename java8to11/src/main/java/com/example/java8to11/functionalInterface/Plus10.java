package com.example.java8to11.functionalInterface;

import java.util.function.Function;

/* Function Interface */
public class Plus10 implements Function<Integer,Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer+10;
    }
}
