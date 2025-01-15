package br.com.davidlopes;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTeste {
    @Test
    public void testeClasseCliente(){
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("David");
        cli.adicionarNome1("David");

        Assert.assertEquals("David", cli.getNome());
    }
}
