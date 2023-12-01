package daw;

import java.util.Random;

public class Naipe {

    String numeroCarta;
    String palo;

    public Naipe() {

        Random r = new Random();
        String[] numeroCarta = {"1", "2", "3", "4", "5", "6", "7", "sota", "caballo",
            "rey"};
        String[] palo = {"oros", "bastos", "espadas", "copas"};

        this.numeroCarta = numeroCarta[r.nextInt(0, 11)];
        this.palo = palo[r.nextInt(0, 5)];
    }
}
