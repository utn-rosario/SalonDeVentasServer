/*
 * Created on 31 oct 2016 ( Time 11:50:44 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package org.salondeventas.server.modelo.jpa;

import java.io.Serializable;

import javax.validation.constraints.*;
//import org.hibernate.validator.constraints.* ;

import java.util.List;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "permiso"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="permiso", catalog="salon_de_ventas" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="PermisoEntity.countAll", query="SELECT COUNT(x) FROM PermisoEntity x" )
} )
public class PermisoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="idpermiso", nullable=false, length=10)
    private String     idpermiso    ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
	@NotNull
	@Size(max = 90)
    @Column(name="nombre", nullable=false, length=90)
    private String     nombre       ;

	@Size(max = 255)
    @Column(name="descripcion", length=255)
    private String     descripcion  ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToMany(mappedBy="listOfPermiso", targetEntity=PerfilesEntity.class)
    private List<PerfilesEntity> listOfPerfiles;

    @ManyToMany(mappedBy="listOfPermiso", targetEntity=PantallaEntity.class)
    private List<PantallaEntity> listOfPantalla;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public PermisoEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdpermiso( String idpermiso ) {
        this.idpermiso = idpermiso ;
    }
    public String getIdpermiso() {
        return this.idpermiso;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : nombre ( VARCHAR ) 
    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    //--- DATABASE MAPPING : descripcion ( VARCHAR ) 
    public void setDescripcion( String descripcion ) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setListOfPerfiles( List<PerfilesEntity> listOfPerfiles ) {
        this.listOfPerfiles = listOfPerfiles;
    }
    public List<PerfilesEntity> getListOfPerfiles() {
        return this.listOfPerfiles;
    }

    public void setListOfPantalla( List<PantallaEntity> listOfPantalla ) {
        this.listOfPantalla = listOfPantalla;
    }
    public List<PantallaEntity> getListOfPantalla() {
        return this.listOfPantalla;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(idpermiso);
        sb.append("]:"); 
        sb.append(nombre);
        sb.append("|");
        sb.append(descripcion);
        return sb.toString(); 
    } 

}
