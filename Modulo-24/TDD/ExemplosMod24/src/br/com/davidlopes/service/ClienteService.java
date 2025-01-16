package br.com.davidlopes.service;

import br.com.davidlopes.dao.ClienteDao;
import br.com.davidlopes.dao.ClienteDaoMock;
import br.com.davidlopes.dao.IClienteDao;

public class ClienteService {
    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }
}
