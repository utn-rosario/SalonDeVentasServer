/*
 * Created on 4 oct 2016 ( Time 09:46:21 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.salondeventas.server.persistence.services;

import java.util.List;
import java.util.Map;

import org.salondeventas.server.modelo.jpa.ProductoEntity;
import org.salondeventas.server.modelo.jpa.VproductosEntity;

/**
 * Basic persistence operations for entity "Producto"
 * 
 * This Bean has a basic Primary Key : Integer
 *
 * @author Telosys Tools Generator
 *
 */
public interface ProductoPersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param producto
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(ProductoEntity producto) ;

	/**
	 * Deletes the entity by its Primary Key <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param idproducto
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(Integer idproducto) ;

	/**
	 * Inserts the given entity and commit <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param producto
	 */
	public void insert(ProductoEntity producto) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param idproducto
	 * @return the entity loaded (or null if not found)
	 */
	public ProductoEntity load(Integer idproducto) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<ProductoEntity> loadAll() ;
	public List<VproductosEntity> loadAllVista() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<ProductoEntity> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<ProductoEntity> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param producto
	 * @return
	 */
	public ProductoEntity save(ProductoEntity producto) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<ProductoEntity> search( Map<String, Object> criteria ) ;

	/**
	 * Count all the occurrences
	 * @return
	 */
	public long countAll();
	
}
