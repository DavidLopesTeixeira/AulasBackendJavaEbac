package br.com.davidlopes;

import br.com.davidlopes.dao.ContratoDao;
import br.com.davidlopes.dao.IContratoDao;
import br.com.davidlopes.dao.moks.ContratoDaoMock;
import br.com.davidlopes.service.ContratoService;
import br.com.davidlopes.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }
}
