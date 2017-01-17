package br.com.suitability.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.suitability.exception.ErroSistema;
import br.com.suitability.repository.RepositoryFactory;

public abstract class BaseDao<E> implements IBaseDao<E> {

	protected void save(E entidade) throws ErroSistema {
		try {
			EntityManager manager = RepositoryFactory.getContext();

			//TODO -save or update
			manager.getTransaction().begin();
			manager.persist(entidade);
			manager.getTransaction().commit();

			manager.close();

		} catch (Exception ex) {
			throw new ErroSistema("Ocorreu um erro ao Salvar!", ex);
		}
	}

	protected List<E> getAll() throws ErroSistema {
		try {
			//TODO 
			List<E> list = new ArrayList<E>();			
			return list;

		} catch (Exception ex) {
			throw new ErroSistema("Ocorreu um erro ao Listar!", ex);
		}
	}
	
	protected E search(E entidade) throws ErroSistema {
		try {			
			//TODO 
			return entidade;

		} catch (Exception ex) {
			throw new ErroSistema("Ocorreu um erro na busca!", ex);
		}
	}
	
	protected void exclude(E entidade) throws ErroSistema {
		try {			
			//TODO 

		} catch (Exception ex) {
			throw new ErroSistema("Ocorreu um erro ao Excluir!", ex);
		}
	}

}
