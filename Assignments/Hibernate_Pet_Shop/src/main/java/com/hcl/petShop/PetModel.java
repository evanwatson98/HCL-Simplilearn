package com.hcl.petShop;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hcl.entities.Pet;

public class PetModel {

	protected SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public boolean update(Pet pet) {
		boolean result = true;
		Session session = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(pet);
		 
        //Commit the transaction
        session.getTransaction().commit();
        session.close();
		return result;
	
	}
}