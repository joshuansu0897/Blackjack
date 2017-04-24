package Blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    //public static String[] palos={"diamantes", "tréboles", "corazones", "espadas"};
    public static String[] palos = {"♦", "♣", "♥", "♠"};
    private final ArrayList<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        for (String palo : palos) {
            for (int i = 1; i <= 13; i++) {
                cartas.add(new Carta(palo, i));
            }
        }
    }

    @Override
    public String toString() {
        return cartas.toString();
    }

    public Carta getCartaDeLaBaraja() {
        return cartas.remove(0);
    }

    public void barajear() {
        Collections.shuffle(cartas);
    }

    public int getCuantasCartasQuedan() {
        return cartas.size();
    }
}
