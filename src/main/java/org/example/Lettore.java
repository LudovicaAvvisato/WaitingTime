package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lettore implements Runnable {

    @Override
    public void run() {
        BufferedReader Miele= new BufferedReader(new InputStreamReader("Mieli.json"));
        System.out.println(Miele);
    }
}
