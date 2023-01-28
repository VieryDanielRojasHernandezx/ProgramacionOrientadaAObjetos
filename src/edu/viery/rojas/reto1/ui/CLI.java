package edu.viery.rojas.reto1.ui;
import edu.viery.rojas.reto1.process.calculadora;
import java.util.Scanner;
public class CLI {
        public static void main(String[] args){
            System.out.println("que operacion deseas hacer?");
            System.out.println("1)suma");
            System.out.println("2)resta");
            System.out.println("3)multiplicacion");
            System.out.println("4)division");

            Scanner scanner = new Scanner(System.in);

            int option = scanner.nextInt();scanner.nextLine();

            System.out.println("inserta el valor del primer dato");
            int operando1 =  scanner.nextInt();scanner.nextLine();
            System.out.println("inserta el valor del segundo dato");
            int operando2 =  scanner.nextInt();scanner.nextLine();
            int resultado=-1;
            String operacion ="";

            switch(option) {
                case 1:
                    resultado =
                            calculadora.sumarNumeros(operando1, operando2);
                    operacion = "+";
                    break;
            }
            System.out.printf("El resultado ha sido encontrado es %d %s %d = %d",operando1,operacion,operando2,resultado);


        }


    }


