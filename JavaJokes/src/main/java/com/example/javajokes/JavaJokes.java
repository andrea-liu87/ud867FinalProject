package com.example.javajokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaJokes {

    public String getJoke(){
        List<String> jokes = new ArrayList<>();
        jokes.add("A journalist ask a programmer : What makes code bad? No comment");
        jokes.add("How does a computer get drunk? It takes screenshots");
        jokes.add("Autocorrect has become my worst enema.");
        Random rand = new Random();
        return jokes.get(rand.nextInt(jokes.size()));
    }
}
