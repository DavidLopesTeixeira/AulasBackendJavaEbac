package br.davidlopes.testes;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void primeiroTeste(){
        String nome = "David";
        Assert.assertEquals("David",nome);
    }

    @Test
    public void testNotEquals(){
        String nome = "David";
        Assert.assertNotEquals("Daniela",nome);
    }


}
