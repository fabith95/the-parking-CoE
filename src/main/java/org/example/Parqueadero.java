package org.example;

import java.util.ArrayList;

class Parqueadero {
    private ArrayList<PlazaEstacionamiento> plazas;

    public Parqueadero(int numPlazas) {
        plazas = new ArrayList<>();
        for (int i = 1; i <= numPlazas; i++) {
            plazas.add(new PlazaEstacionamiento(i));
        }
    }

    public void buscarCarro(Carro carro, String placa) {
        if (placa.equals(carro.getPlaca())) {
            PlazaEstacionamiento plaza = buscarPlazaPorPlaca(carro.getPlaca());
            if (plaza != null) {
                plaza.asignarCarro(carro);
                System.out.println("Carro registrado en la plaza: " + plaza.getNumeroPlaza());
            } else {
                System.out.println("No se encontró plaza disponible para el carro con placa " + carro.getPlaca());
            }
        }else {
            System.out.println("Registro de carro no encontrado!");
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
}
