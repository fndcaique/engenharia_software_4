package testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import triangulo.model.Triangulo;

/**
 *
 * @author fndcaique
 */
@RunWith(JUnitParamsRunner.class)

public class TUnitario {

    public TUnitario() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    @FileParameters("teste_tipo.csv")
    public void VerificarTipo(int l1, int l2, int l3, String resultado) {
        Triangulo t = new Triangulo(l1, l2, l3);
        Assert.assertEquals(resultado, t.getTipo());

    }

    @Test
    @FileParameters("teste_valores.csv")
    public void VerificarValido(int l1, int l2, int l3, boolean resultado) {
        Triangulo t = new Triangulo(l1, l2, l3);
        Assert.assertEquals(resultado, t.checkValues());

    }

    @Test
    @FileParameters("teste_soma.csv")
    public void verificarSoma(int l1, int l2, int l3, boolean resultado) {
        Triangulo t = new Triangulo(l1, l2, l3);
        Assert.assertEquals(resultado, t.checkSoma());
    }

}
