package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParqueaderoTest {
    @Test
    void crearParqueadero() {
        Parqueadero parqueadero = new Parqueadero(10);
        Assertions.assertNotNull(parqueadero);
    }

    @Test
    void crearCarro() {
        Carro carro = new Carro("EJE59E", 80);
        Assertions.assertNotNull(carro);
        Assertions.assertEquals("EJE59E", carro.getPlaca());
        Assertions.assertEquals(80, carro.getPeso());
    }
}
