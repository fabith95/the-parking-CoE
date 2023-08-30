package org.example;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5);

        Carro carro1 = new Carro("EJE59A", 80);
        Carro carro2 = new Carro("VJY67A", 1800);
        Carro carro3 = new Carro("SSSS", 100);

        parqueadero.buscarCarroXPlaca(carro1, "EJE59A");
        System.out.println();

        parqueadero.buscarCarroXPlaca(carro2, "VJY67A");
        System.out.println();

        System.out.println(carro3.toString());
        parqueadero.buscarCarroXPlaca(carro3, "SSSS");
        System.out.println();

        System.out.println("Aqui busqueda por Peso Kg: ");
        System.out.println(carro3.getPeso());
        parqueadero.buscarCarroXPeso(carro3, 100);
        System.out.println();

        System.out.println("Aqui busqueda por Placa: ");
        System.out.println(carro2.getPlaca());
        parqueadero.buscarCarroXPlaca(carro2, "VJY67A");

    }
}