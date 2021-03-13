package com.hcl.petShop;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hcl.entities.User;

public class UserModel {
	protected SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public boolean update(User user) {

		boolean result = false;
		
		if(!exists(user.getEmail())) {
			result = true;
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			 
	        //Commit the transaction
	        session.getTransaction().commit();
	        session.close();
		}
		return result;
	
	}
	
	public boolean exists(String email) {
		Session session = sessionFactory.openSession();
		try {			
			
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<User> cr = cb.createQuery(User.class);
			Root<User> root = cr.from(User.class);
			// Example
//			cr.select(root).where(cb.like(root.get("itemName"), "%chair%"));

			cr.select(root).where(cb.like(root.get("email"), email));

			@SuppressWarnings("deprecation")
			Query<User> query = session.createQuery(cr);
			List<User> results = query.getResultList();
			
			if(results.size() == 0) {
				return false;
			}
			return true;
			  
		}catch(Exception e) {
			e.printStackTrace();
		}
        session.close();

		return true;
		
	}
	
	public boolean confirmPass(String email, String password) {

		Session session = sessionFactory.openSession();
		
		try {			
			
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<User> cr = cb.createQuery(User.class);
			Root<User> root = cr.from(User.class);
			// Example
//			cr.select(root).where(cb.like(root.get("itemName"), "%chair%"));

			///////////
			///////////
			//////////
			////////////
			///////////
			/////////// Need to finsish query
			cr.select(root).where(cb.like(root.get("email"), email));
			
			@SuppressWarnings("deprecation")
			Query<User> query = session.createQuery(cr);
			List<User> results = query.getResultList();
			System.out.print("confirm password" + results.toString());
//			String hql = "SELECT User.password FROM User WHERE User.password = " + password;
//			Query query = session.createQuery(hql);
//			List<User> results = query.getResultList();
//			
			if(results.size() == 0) {
				return false;
			}else if(password.equals(results.get(0).getPassword())) {
				return true;
			}
			return false;
			  
		}catch(Exception e) {
			e.printStackTrace();
		}
        session.close();

		return false;
	}
}
