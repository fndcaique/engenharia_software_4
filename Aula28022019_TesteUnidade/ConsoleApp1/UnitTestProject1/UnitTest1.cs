using System;
using ConsoleApp4;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace UnitTestProject1
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Triangulo t = new Triangulo();
            Assert.AreEqual("Escleno", t.VerificarTipo(3, 2, 1));
        }
    }
}
