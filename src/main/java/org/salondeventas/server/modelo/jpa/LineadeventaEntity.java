/*
 * Created on 8 oct 2016 ( Time 23:53:13 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a composite Primary Key  


package org.salondeventas.server.modelo.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "lineadeventa"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="lineadeventa", catalog="salon_de_ventas" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="LineadeventaEntity.countAll", query="SELECT COUNT(x) FROM LineadeventaEntity x" )
} )
public class LineadeventaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( EMBEDDED IN AN EXTERNAL CLASS )  
    //----------------------------------------------------------------------
	@EmbeddedId
    private LineadeventaEntityKey compositePrimaryKey ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="idVenta", referencedColumnName="idVenta", insertable=false, updatable=false)
    private VentaEntity venta       ;

    @ManyToOne
    @JoinColumn(name="idproducto", referencedColumnName="idProducto", insertable=false, updatable=false)
    private ProductoEntity producto    ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public LineadeventaEntity() {
		super();
		this.compositePrimaryKey = new LineadeventaEntityKey();       
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE COMPOSITE KEY 
    //----------------------------------------------------------------------
    public void setIdlineadeventa( Integer idlineadeventa ) {
        this.compositePrimaryKey.setIdlineadeventa( idlineadeventa ) ;
    }
    public Integer getIdlineadeventa() {
        return this.compositePrimaryKey.getIdlineadeventa() ;
    }
    public void setIdproducto( Integer idproducto ) {
        this.compositePrimaryKey.setIdproducto( idproducto ) ;
    }
    public Integer getIdproducto() {
        return this.compositePrimaryKey.getIdproducto() ;
    }
    public void setIdventa( Integer idventa ) {
        this.compositePrimaryKey.setIdventa( idventa ) ;
    }
    public Integer getIdventa() {
        return this.compositePrimaryKey.getIdventa() ;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setVenta( VentaEntity venta ) {
        this.venta = venta;
    }
    public VentaEntity getVenta() {
        return this.venta;
    }

    public void setProducto( ProductoEntity producto ) {
        this.producto = producto;
    }
    public ProductoEntity getProducto() {
        return this.producto;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        if ( compositePrimaryKey != null ) {  
            sb.append(compositePrimaryKey.toString());  
        }  
        else {  
            sb.append( "(null-key)" ); 
        }  
        sb.append("]:"); 
        return sb.toString(); 
    } 

}
