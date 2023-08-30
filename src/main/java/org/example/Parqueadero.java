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

    public String registrarCarroXPlaca(Carro carro, String placa) {
        String pla = "";
        if (placa.equals(carro.getPlaca())) {
            PlazaEstacionamiento plaza = buscarPlazaPorPlaca(placa);
            if (plaza != null) {
                plaza.asignarCarro(carro);
                pla = ("Carro registrado en la plaza: " + plaza.getNumeroPlaza());
            } else {
                pla = ("No se encontró plaza disponible para el carro con placa " + carro.getPlaca());
            }
        } else {
            pla = ("Registro de carro no encontrado!");
        }
        return pla;
    }

    public String buscarCarroXPeso(Carro carro, double peso) {
        PlazaEstacionamiento plaza = buscarPlazaPorPesoCarro(peso);
        String pes = "";
        if (peso == carro.getPeso()) {
            pes = "Carro registrado con peso " + peso + " en la plaza: " + plaza.getNumeroPlaza();
        } else {
            pes = "No se encontró plaza disponible para el carro con peso " + carro.getPeso();
        }
        return pes;
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
