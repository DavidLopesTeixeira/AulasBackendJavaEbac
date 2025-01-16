package br.com.davidlopes.service;

import br.com.davidlopes.dao.IContratoDao;

public class ContratoService implements  IContratoService{

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();

        return "Sucesso";
    }
}
