package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BancaMiele {
    public static void main(String[] args) {
        Lettore lettore =new Lettore("Mieli.json");
        lettore.run();
    }
}