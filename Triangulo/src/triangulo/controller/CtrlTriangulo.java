/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo.controller;

import triangulo.model.Triangulo;

/**
 *
 * @author fnd
 */
public class CtrlTriangulo {

    private Triangulo tri;

    public String verificar(int l1, int l2, int l3) {
        tri = new Triangulo(l1, l2, l3);
        if (tri.checkValues()) {
            if (tri.checkSum()) {
                return tri.getType();
            }
            return "-1";
        }
        return "0";
    }
}
