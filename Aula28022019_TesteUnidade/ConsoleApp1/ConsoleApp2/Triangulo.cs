using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp2
{
    class Triangulo
    {
        public Triangulo()
        {

        }
        public String VerificarTipo(int l1, int l2, int l3)
        {
            if ((l1 == l2) && (l2 == l3) && (l1 == l3))
            {
                return ("Equilatero");
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
}
}
