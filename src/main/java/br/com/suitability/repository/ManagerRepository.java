package br.com.suitability.repository;

import javax.persistence.EntityManager;

public class ManagerRepository {

	public static void main(String[] args) {

		EntityManager manager = RepositoryFactory.getContext();
		manager.close();
		
	}
}
