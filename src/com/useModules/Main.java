package com.useModules;

import com.example.greeterapi.Greeter;
import com.lovely.Nice;
import learn.lovely.Lovely;
import name.lemubit.Lemubit;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {

        var greeters = ServiceLoader.load(Greeter.class);

        for (var greeter : greeters) {
            System.out.println(greeter.greet("Java"));
        }


    }

}