package br.com.suitability.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RepositoryFactory {

	private static EntityManagerFactory factory;
	private static EntityManager SessionEntityManager;

	/*
	 * Bloco estático para inicializar a fábrica de Entity Manager; isso
	 * ocorrerá apenas uma vez, no carregamento da classe.
	 */
	static {
		factory = Persistence.createEntityManagerFactory("derivativos");
	}

	public static EntityManager getContext() {		
		return (SessionEntityManager == null)? SessionEntityManager = factory.createEntityManager(): SessionEntityManager;			
	}
}
