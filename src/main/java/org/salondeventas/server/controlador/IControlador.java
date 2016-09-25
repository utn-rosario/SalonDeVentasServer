package org.salondeventas.server.controlador;

import java.io.Serializable;
import java.util.List;

public interface IControlador <T, ID extends Serializable> {
	
	public String agregar(String usuario, String clave, T entity);
	public String borrar(String usuario, String clave, T entity);	
	public T obtener(String usuario, String clave, long id);
	public String actualizar(String usuario, String clave, T entity);
	public List<T> obtenerTodos(String usuario, String clave);
}
