package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lettore implements Runnable {

    @Override
    public void run() {
//invoca Leggi
    }
    public void Leggi(){
    BufferedReader lettore= new BufferedReader(new InputStreamReader("Mieli.json"));
        System.out.println(lettore);
}
