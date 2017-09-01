package br.com.suitability.dao;

import java.util.List;

import br.com.suitability.entidade.Pessoa;
import br.com.suitability.exception.ErroSistema;
import br.com.system.core.dao.BaseDao;

public class PessoaDAO extends BaseDao<Pessoa> {

	@Override
	public void salvar(Pessoa entidade) throws ErroSistema {
		try {
			// validar
			super.save(entidade);

		} catch (Exception ex) {
			throw new ErroSistema("Ocorreu um erro ao Salvar!", ex);
		}
	}

	@Override
	public Pessoa Obter(int Id) {
		// TODO Auto-generated method stub
		// super.getAll();

		return null;
	}

	@Override
	public void deletar(Pessoa entidade) throws ErroSistema {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pessoa> buscar() throws ErroSistema {
		// TODO Auto-generated method stub
		return null;
	}

}
