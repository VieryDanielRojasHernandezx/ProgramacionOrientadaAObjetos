package edu.viery.rojas.reto2.boletos;
import java.util.Scanner;

    public class Boletos {
        public static void showMenu() {

            salida:
            do {
                System.out.println("elige un boleto a comprar");
                System.out.println("a) Niño: $70");
                System.out.printf(" b) adulto: $100");
                System.out.println("s) salir");

                String tipoBoleto = "";
                Scanner scanner = new Scanner(System.in);
                tipoBoleto = scanner.nextLine();
                if (tipoBoleto.equals("s")) {
                    break salida;
                }
                int child = 0;
                switch (tipoBoleto) {
                    case "a":
                        child++;
                        break;
                }
                int adult = 0;
                switch (tipoBoleto) {
                    case "a":
                        adult++;
                        break;
                }
                switch (tipoBoleto) {
                    case "s":
                        return;


                }
                while (true) ;
            }
            while (true) ;
        }
    }











