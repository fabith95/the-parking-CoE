package org.example;

class PlazaEstacionamiento {
    private int numeroPlaza;
    private Carro carro;

    public PlazaEstacionamiento(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
        this.carro = null;
    }

    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public Carro getCarro() {
        return carro;
    }

    public void asignarCarro(Carro carro) {
        this.carro = carro;
    }
}