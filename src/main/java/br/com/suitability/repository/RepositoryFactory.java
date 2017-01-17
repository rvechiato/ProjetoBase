package br.com.suitability.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RepositoryFactory {

	private static EntityManagerFactory factory;
	private static EntityManager SessionEntityManager;

	/*
	 * Bloco est�tico para inicializar a f�brica de Entity Manager; isso
	 * ocorrer� apenas uma vez, no carregamento da classe.
	 */
	static {
		factory = Persistence.createEntityManagerFactory("derivativos");
	}

	public static EntityManager getContext() {		
		return (SessionEntityManager == null)? SessionEntityManager = factory.createEntityManager(): SessionEntityManager;			
	}
}
