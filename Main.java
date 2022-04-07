package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Test Maximum Program");

        List<Float> list = new ArrayList<>();
        list.add(12.564f);
        list.add(12.12f);
        list.add(12.96f);

        list.sort(Float :: compareTo);
        System.out.println("The maximum of three numbers is: " + list.get(list.size()-1));
    }
}
