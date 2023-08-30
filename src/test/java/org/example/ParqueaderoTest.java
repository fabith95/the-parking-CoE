package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParqueaderoTest {
    @Test
    void crearParqueadero() {
        Parqueadero parqueadero = new Parqueadero(5);
        Assertions.assertNotNull(parqueadero);
    }

    @Test
    void crearCarro() {
        Carro carro = new Carro("EJE59E", 80);
        Assertions.assertNotNull(carro);
        assertEquals("EJE59E", carro.getPlaca());
        assertEquals(80, carro.getPeso());
    }

    @Test
    void encontrarCarroPorPlaca(){
        Parqueadero parqueadero = new Parqueadero(10);
        Carro carro = new Carro("EJE59E", 80);

        Assertions.assertEquals("Carro registrado en la plaza: 1",
                parqueadero.buscarCarroXPlaca(carro, "EJE59E"));
    }

    @Test
    void encontrarCarroPorPeso(){
        Parqueadero parqueadero = new Parqueadero(5);
        Carro carro = new Carro("VJY67A", 100);

        Assertions.assertEquals("Carro registrado con peso 100.0 en la plaza: 1",
                        parqueadero.buscarCarroXPeso(carro, 100));
    }

}
