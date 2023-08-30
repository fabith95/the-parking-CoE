package org.example;

public interface buscar {

    public void buscarCarroXPlaca(Carro carro, String placa);

    public void buscarCarroXPeso(Carro carro, double peso);
    public PlazaEstacionamiento buscarPlazaPorPlaca(String placa);

    public PlazaEstacionamiento buscarPlazaPorPesoCarro(double peso);

}
