package org.salondeventas.server.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.sql.DataSource;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * This class provides a generic default implementation for many functionalities
 * used in persistence mechanisms. It offers standard CRUD functions for JPA
 * applications plus count() and findInRange() functions as they are frequently
 * used in Web applications.
 * 
 * 
 * @author Stefan Schmidt
 * @since 0.1
 * 
 * @param <T>
 *            the type to be persisted (i.e. Person.class)
 * @param <ID>
 *            the identifier type
 */
public abstract class GenericDAOWithHibernate<T, ID extends Serializable>{
	protected Class<T> persistentClass;
	
	@Autowired
	protected SessionFactory sessionFactory;
	
	@Autowired
	protected DataSource dataSource;

	@SuppressWarnings("unchecked")
	public GenericDAOWithHibernate() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}		

	public Class<T> getPersistentClass() {
		return persistentClass;
	}
	
	@SuppressWarnings("unchecked")
	public T get(ID id) throws HibernateException{
		return (T)sessionFactory.getCurrentSession().get(persistentClass, id);				
	}

	public void save(T entity) {		
		try{
			sessionFactory.getCurrentSession().save(entity);
		}catch(HibernateException e){
			e.printStackTrace();
		}
	}

	public void update(T entity) {
		try{
			sessionFactory.getCurrentSession().update(entity);	
		}catch(HibernateException e){
			e.printStackTrace();
		}
	}

	public void delete(T entity) throws HibernateException{
		sessionFactory.getCurrentSession().delete(entity);	
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() throws HibernateException{
		return sessionFactory.getCurrentSession().createQuery("Select t from " + persistentClass.getSimpleName() + " t").list();
	}

	@SuppressWarnings("unchecked")
	public List<T> getInRange(int firstResult, int maxResults) throws HibernateException{
		return sessionFactory.getCurrentSession().createQuery("Select t from " + persistentClass.getSimpleName() + " t").list();
	}

	public int count() throws HibernateException{
		return sessionFactory.getCurrentSession().createQuery("Select count(t) from " + persistentClass.getSimpleName() + " t").list().size();
	}	
	
	public DataSource getDataSource(){
		return dataSource;
	}
}
