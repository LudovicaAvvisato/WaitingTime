package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lettore implements Runnable {

    private String miele;

    public Lettore(String miele) {
        this.miele = miele;
    }

    @Override
    public void run() {
        leggi();
    }

    public void leggi() {
        try (BufferedReader br = new BufferedReader(new FileReader(this.miele))) {
            String riga;
            while ((riga = br.readLine()) != null) {
                System.out.println(riga);
            }
        } catch (IOException e) {
            System.err.println("Errore nella lettura del file: " + e.getMessage());
        }
    }
}