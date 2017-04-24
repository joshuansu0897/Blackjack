package Blackjack;

public class Carta {

    private final String palo;
    private final int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return getValor() + " " + palo;
    }

    public static int sacarCuenta(Carta[] mano) {
        int c = 0;
        boolean As = false;
        for (Carta carta : mano) {
            switch (carta.numero) {
                case 1:
                    c += 11;
                    As = true;
                    break;
                case 11:
                case 12:
                case 13:
                    c += 10;
                    break;
                default:
                    c += carta.numero;
            }
        }
        if (c > 21 && As) {
            return c - 10;
        } else {
            return c;
        }
    }

    public String getValor() {
        switch (this.numero) {
            case 1:
                return "as";
            case 11:
                return "jota";
            case 12:
                return "reina";
            case 13:
                return "rey";
            default:
                return String.valueOf(numero);
        }
    }
}
