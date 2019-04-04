/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import triangulo.controller.CtrlTriangulo;

/**
 *
 * @author fnd
 */
@RunWith(JUnitParamsRunner.class)
public class TIntegracao {
    
    public TIntegracao() {
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
    
    /**
     * teste de integração
     * @param l1
     * @param l2
     * @param l3
     * @param res
     */
    @Test
    @FileParameters("teste_integracao.csv")
    public void verificarAll(int l1, int l2, int l3, String res) {
        CtrlTriangulo ctrl = new CtrlTriangulo();
        Assert.assertEquals(res, ctrl.verificar(l1, l2, l3));
    }
}
