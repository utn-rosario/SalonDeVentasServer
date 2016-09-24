package org.salondeventas.server.servicio;

import java.io.Serializable;
import java.util.List;

public interface IServicio<T, ID extends Serializable> {
	
	public boolean agregar(T entity);
	public boolean borrar(T entity);	
	public T obtener(long id);
	public boolean actualizar(T entity);
	public List<T> obtenerTodos();
}