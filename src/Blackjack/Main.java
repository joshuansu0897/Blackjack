package Blackjack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean continuar = false;
        Baraja baraja = new Baraja();
        baraja.barajear();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Cuantas cartas quieres?(te recomiendo 5 o menos)");
            int n = sc.nextInt();
            Carta miMano[] = new Carta[n];
            for (int i = 0; i < n ; i++) {
                miMano[i] = baraja.getCartaDeLaBaraja();
            }
            
            System.out.println("Cartas sacadas:");
            for (Carta m : miMano) {
                System.out.println(m);
            }
            
            if (Carta.sacarCuenta(miMano) <= 21 && Carta.sacarCuenta(miMano) >= 17) {
                System.out.println("Ganas, tienes: "+Carta.sacarCuenta(miMano));
            } else if(Carta.sacarCuenta(miMano) > 21){
                System.out.println("Tienes "+Carta.sacarCuenta(miMano)+" mas de 21, pierdes.");
            }else{
                System.out.println("Tienes "+Carta.sacarCuenta(miMano)+" menos de 17, pierdes.");
            }
            
            System.out.println("Quieres continuar? (true) (false)");
            continuar = sc.nextBoolean();
            if(!(baraja.getCuantasCartasQuedan() >= 4)){
                System.out.println("Quedan menos de 5 cartas, no se puede jugar asi!");
                continuar = false;
            }
        } while (continuar);
    }
}
