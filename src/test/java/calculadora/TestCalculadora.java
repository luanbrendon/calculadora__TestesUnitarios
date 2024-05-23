package calculadora;

import calculadora.Calculadora;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCalculadora {
    @Test
    public void testGetAdicao () {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getAdicao();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
