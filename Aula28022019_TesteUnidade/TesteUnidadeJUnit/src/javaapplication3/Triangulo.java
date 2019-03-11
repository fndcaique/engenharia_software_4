package javaapplication3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Triangulo {
    
    public Triangulo()
    {
        
    }
    
    // verificar dados
    // verificar a soma

    public String VerificarTipo(int l1, int l2, int l3)
    {
     if((l1==l2) &&(l2==l3)&&(l1==l3))
     {
         return("Equilatero");
     }
     else
     {
         if ((l1 != l2) && (l2 != l3) && (l1 != l3)) 
         {
             return ("Escaleno");
         } 
         else 
         {
             return ("Isósceles");
         }
     }
    }
}
