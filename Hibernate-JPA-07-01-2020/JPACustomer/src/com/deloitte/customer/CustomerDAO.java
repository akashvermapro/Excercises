package com.deloitte.customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CustomerDAO {
	private EntityManager entityManager;
	private EntityManagerFactory factory; 
	
	public CustomerDAO(){
		factory = Persistence.createEntityManagerFactory("JPA-PU");
		entityManager = factory.createEntityManager();
	}
	
	public CustomerEntity getCustomerById(int id){
		CustomerEntity customer = entityManager.find(CustomerEntity.class, id);
		return customer;
	}
	
	public void addCustomer(CustomerEntity customer){
		beginTransaction();
		entityManager.persist(customer);
		commitTransaction();	
	}

	public void removeCustomer(CustomerEntity customer){
		beginTransaction();
		entityManager.remove(customer);
		commitTransaction();	
	}

	public void updateCustomer(CustomerEntity customer){
		beginTransaction();
		entityManager.merge(customer);
		commitTransaction();	
	}

	public void beginTransaction(){
		entityManager.getTransaction().begin();
	}
	
	public void commitTransaction(){
		entityManager.getTransaction().commit();
	}

}
