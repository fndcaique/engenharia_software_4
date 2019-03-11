/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication3.Triangulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class TTriangulo {

    public TTriangulo() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() { // 
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void VerificaTipo0() {
        Triangulo t = new Triangulo();
        Assert.assertEquals("Equilatero", t.VerificarTipo(1, 1, 1));
    }

    @Test
    public void VerificaTipo1() {
        Triangulo t = new Triangulo();
        Assert.assertEquals("Escaleno", t.VerificarTipo(3, 2, 1));
    }

    @Test
    public void VerificaTipo2() {
        Triangulo t = new Triangulo();
        Assert.assertEquals("Isósceles", t.VerificarTipo(1, 2, 2));
    }
}
