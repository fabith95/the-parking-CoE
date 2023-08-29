package org.example;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(10);

        Carro carro = new Carro("EJE59A", 80);
        Carro carro1 = new Carro("VJY67A", 1800);

        System.out.println(carro.toString());
        parqueadero.buscarCarro(carro, "EJE59A");
        System.out.println();
        System.out.println(carro1.toString());
        parqueadero.buscarCarro(carro1, "NOT30A");

    }
}