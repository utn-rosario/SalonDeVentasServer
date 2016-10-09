package org.salondeventas.server.services;

import java.io.Serializable;
import java.util.List;

public interface Service<T, ID extends Serializable> {
	
	public boolean insert(T entity);
	public boolean update(T entity);
	public boolean delete(T entity);		
	public List<T> loadAll();
}