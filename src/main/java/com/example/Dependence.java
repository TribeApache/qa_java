package com.example;

public class Dependence {
    public static void main(String[] args) throws Exception {
        String[] sex = {
                "�����",
                "�����"
        };
        Feline feline = new Feline();
        Lion lion = new Lion(sex[0], feline);

    }
}