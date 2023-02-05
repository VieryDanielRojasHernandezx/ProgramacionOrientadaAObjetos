package edu.viery.rojas.reto2.boletos.process;


public class CalculadorCostos {
    public static double PRECIO_CHILD = 70;
    public static double PRECIO_ADULT = 100;
    public static double PRECIO_SENIOR = 6.5;
    public static double calcularCosto(int numChild,int numAdult, int numSenior){
        return (numChild * PRECIO_CHILD) + (numAdult * PRECIO_ADULT) + (numSenior * PRECIO_SENIOR);

    }
}
