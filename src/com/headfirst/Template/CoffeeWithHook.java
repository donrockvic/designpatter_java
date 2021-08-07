package com.headfirst.Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addSediment() {
        System.out.println("Adding sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() throws IOException {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() throws IOException {
        String answer = null;
        System.out.println("Would you like milk and sugar with your Coffee?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch (IOException e) {
            System.err.println("IO error trying to read your answer");
        }

        if(answer==null)
            return "no";

        return answer;
    }
}
