package br.com.suitability.bean;

import java.util.List;

import br.com.suitability.dao.IBaseDao;
import br.com.suitability.exception.ErroSistema;

public abstract class BaseBean<E, D extends IBaseDao<E>> {

	// property
	private E entidade;
	private List<E> ListEntidades;

	// Abstractions
	public abstract D getDao();
	public abstract E criarNovaEntidade();

	// Methods
	public void novo() {
		entidade = this.criarNovaEntidade();
	}

	public void salvar() {
		try {
			this.getDao().salvar(entidade);
			this.novo();
		} catch (ErroSistema ex) {
			// adicionarMensagem(ex.getMessage(), FacesMessage.SEVERITY_ERROR);
		}
	}

	public E getEntidade() {
		return entidade;
	}

	public void setEntidade(E entidade) {
		this.entidade = entidade;
	}

	public List<E> getListEntidades() {
		return ListEntidades;
	}

	public void setListEntidades(List<E> listEntidades) {
		ListEntidades = listEntidades;
	}

}
