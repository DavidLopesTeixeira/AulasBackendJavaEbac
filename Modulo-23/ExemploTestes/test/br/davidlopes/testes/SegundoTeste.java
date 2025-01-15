package br.davidlopes.testes;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTeste {
    @Test
    public void teste2(){
        var nome = "David";
        Assert.assertEquals("David", nome);
    }
}
