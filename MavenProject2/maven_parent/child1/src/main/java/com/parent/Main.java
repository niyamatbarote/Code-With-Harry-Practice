package com.parent;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Gson gson = new Gson();
        System.out.println(gson.toJson(Map.of("Message", "Working Fine: child1")));

    }
}   