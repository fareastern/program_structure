package ru.netology.service;

public class CustomsService {
    private static final int WEIGHT_RATE = 100;

    public static int calculateCustoms(int price, int weight) {
        return price/100+ weight*WEIGHT_RATE;
    }
}