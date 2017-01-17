package br.com.suitability.dao;

import java.util.List;

import br.com.suitability.exception.ErroSistema;

public interface IBaseDao<E> {
	
	public E Obter(int Id);

	public void salvar(E entidade) throws ErroSistema;

	public void deletar(E entidade) throws ErroSistema;

	public List<E> buscar() throws ErroSistema;
	
}
