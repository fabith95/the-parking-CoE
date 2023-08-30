package org.example;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5);

        Carro carro1 = new Carro("EJE59A", 80);
        Carro carro2 = new Carro("VJY67A", 1800);
        Carro carro3 = new Carro("SSSS", 100);

        String respuesta1 = parqueadero.registrarCarroXPlaca(carro1, "EJE59A");
        System.out.println(respuesta1 + "\n");

        String respuesta2 = parqueadero.registrarCarroXPlaca(carro2, "VJY67A");
        System.out.println(respuesta2 + "\n");

        String respuesta3 = parqueadero.registrarCarroXPlaca(carro3, "SSSS");
        System.out.println(respuesta3 + "\n");

        System.out.println("Aqui busqueda por Peso Kg: ");
        System.out.println(carro3.getPeso());
        String answer = parqueadero.buscarCarroXPeso(carro3, 100);
        System.out.println(answer);
        System.out.println(carro3.toString() + "\n");

        System.out.println("Aqui busqueda por Placa: ");
        System.out.println(carro2.getPlaca());
        String ans = parqueadero.registrarCarroXPlaca(carro2, "VJY67A");
        System.out.println(ans);
        System.out.println(carro2.toString() + "\n");

    }
}