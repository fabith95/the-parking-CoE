package org.example;

class Carro {
    private String placa;
    private double peso;

    public Carro(String placa, double peso) {
        this.placa = placa;
        this.peso = peso;
    }

    public String getPlaca() {
        return placa;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", peso=" + peso +
                '}';
    }
}
