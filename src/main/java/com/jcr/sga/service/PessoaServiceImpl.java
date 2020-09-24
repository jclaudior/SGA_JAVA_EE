
package com.jcr.sga.service;

import com.jcr.sga.domain.Pessoa;
import dao.PessoaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PessoaServiceImpl implements PessoaServiceRemote, PessoaService{

    @Inject
    private PessoaDAO pessoaDAO;
    
    @Override
    public List<Pessoa> listarPessoas() {
        return pessoaDAO.buscarTodasPessoas();
    }

    @Override
    public Pessoa encontrarPessoaPorId(Pessoa pessoa) {
        return pessoaDAO.buscarPessoaPorId(pessoa);
    }

    @Override
    public Pessoa encontrarPessoaPoeEmail(Pessoa pessoa) {
        return pessoaDAO.buscarPessoaPorId(pessoa);
    }

    @Override
    public void registrarPessoa(Pessoa pessoa) {
      pessoaDAO.inserirPessoa(pessoa);
    }

    @Override
    public void modificarPessoa(Pessoa pessoa) {
        pessoaDAO.atualizarPessoa(pessoa);
    }

    @Override
    public void deletarPessoa(Pessoa pessoa) {
        pessoaDAO.deletarPessoa(pessoa);
    }
    
}
