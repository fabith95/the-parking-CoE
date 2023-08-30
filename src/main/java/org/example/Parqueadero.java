package org.example;

import java.util.ArrayList;

class Parqueadero implements buscar {
    private ArrayList<PlazaEstacionamiento> plazas;

    public Parqueadero(int numPlazas) {
        plazas = new ArrayList<>();
        for (int i = 1; i <= numPlazas; i++) {
            plazas.add(new PlazaEstacionamiento(i));
        }
    }

    public void buscarCarroXPlaca(Carro carro, String placa) {

        if (placa.equals(carro.getPlaca())) {
            PlazaEstacionamiento plaza = buscarPlazaPorPlaca(placa);
            if (plaza != null) {
                plaza.asignarCarro(carro);
                System.out.println("Carro registrado en la plaza: " + plaza.getNumeroPlaza());
            } else {
                System.out.println("No se encontró plaza disponible para el carro con placa " + carro.getPlaca());
            }
        } else {
            System.out.println("Registro de carro no encontrado!");
        }
    }

    public void buscarCarroXPeso(Carro carro, double peso) {
        PlazaEstacionamiento plaza = buscarPlazaPorPesoCarro(peso);

        if (peso == carro.getPeso()) {
            System.out.println("Carro registrado con peso " + peso + " en la plaza: " + plaza.getNumeroPlaza());
        } else {
            System.out.println("No se encontró plaza disponible para el carro con peso " + carro.getPeso());
        }
    }

    public PlazaEstacionamiento buscarPlazaPorPlaca(String placa) {

        for (PlazaEstacionamiento plaza : plazas) {
            if (plaza.getCarro() == null || plaza.getCarro().getPlaca().equals(placa)) {
                return plaza;
            }
        }
        return null;
    }

    public PlazaEstacionamiento buscarPlazaPorPesoCarro(double peso) {

        for (PlazaEstacionamiento plaza : plazas) {
            if (plaza.getCarro() == null || plaza.getCarro().getPeso() == (peso)) {
                return plaza;
            }
        }
        return null;
    }
}
