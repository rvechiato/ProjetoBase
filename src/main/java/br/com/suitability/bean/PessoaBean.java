package br.com.suitability.bean;

import javax.faces.bean.ManagedBean;

import br.com.suitability.dao.PessoaDAO;
import br.com.suitability.entidade.Pessoa;

import javax.faces.bean.*;

@ManagedBean
@ViewScoped
public class PessoaBean extends BaseBean<Pessoa, PessoaDAO>{	
	
	private PessoaDAO pessoaDAO;

	public PessoaBean() {		
		this.novo();		
	}

	@Override
	public PessoaDAO getDao() {
		if(this.pessoaDAO == null ){
			this.pessoaDAO = new PessoaDAO();
		}		
		
		return this.pessoaDAO;
	}

	@Override
	public Pessoa criarNovaEntidade() {
		return new Pessoa();			
	}	

}
