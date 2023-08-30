package org.example;

public interface buscar {

    public String buscarCarroXPlaca(Carro carro, String placa);

    public String buscarCarroXPeso(Carro carro, double peso);
    public PlazaEstacionamiento buscarPlazaPorPlaca(String placa);

    public PlazaEstacionamiento buscarPlazaPorPesoCarro(double peso);

}
