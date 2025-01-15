package br.com.davidlopes;

import br.com.davidlopes.dao.ClienteDao;
import br.com.davidlopes.dao.ClienteDaoMock;
import br.com.davidlopes.dao.IClienteDao;
import br.com.davidlopes.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTeste(){
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }

    // informando qual erro eu espero receber
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTeste(){
        IClienteDao  mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }
}
