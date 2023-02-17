package control;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlTest {

    @Test
    void ej91() {
        assertEquals(1033, Control.ej9('N',1000,1));
        //No se incrementa el sueldo en la proporcion necesaria, el incremento nunca llega a ocurrir
    }
    @Test
    void ej92() {
        assertEquals(1016, Control.ej9('E',1001,1));
        //No se realiza el incremento
    }
    @Test
    void ej93() {

        assertEquals(1000, Control.ej9('R',1000,1));

    }
    @Test
    void ej94() {

        assertEquals(1000, Control.ej9('N',1000,0));

    }
    @Test
    void ej95() {

        assertEquals(999, Control.ej9('N',999,1));

    }
}