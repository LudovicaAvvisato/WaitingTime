package org.example;

public class BancaMiele {
    public static void main(String[] args) {
        Lettore lettore =new Lettore("src/main/Mieli.json");

        lettore.run();
    }
}