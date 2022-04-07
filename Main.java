package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Test Maximum Program");

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(5);

        list.sort(Integer :: compareTo);
        System.out.println("The maximum of three numbers is: " + list.get(list.size()-1));
    }
}
