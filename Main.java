package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Test Maximum Program");

        List<String> list = new ArrayList<>();
        list.add("sukumar");
        list.add("bridgelabz");
        list.add("india");

        list.sort(String :: compareTo);
        System.out.println("The maximum of three numbers is: " + list.get(list.size()-1));
    }
}
