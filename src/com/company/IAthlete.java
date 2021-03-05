package com.company;

public interface IAthlete {
    default void goal(){
        System.out.println("I want to win Champions League 2021 and World Cup in Qatar 2022");
    }
    void training();
}
