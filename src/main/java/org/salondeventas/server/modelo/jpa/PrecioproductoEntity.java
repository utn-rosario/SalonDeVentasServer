/*
 * Created on 5 oct 2016 ( Time 09:35:18 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a composite Primary Key  


package org.salondeventas.server.modelo.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "precioproducto"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="precioproducto", catalog="salon_de_ventas" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="PrecioproductoEntity.countAll", query="SELECT COUNT(x) FROM PrecioproductoEntity x" )
} )
public class PrecioproductoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( EMBEDDED IN AN EXTERNAL CLASS )  
    //----------------------------------------------------------------------
	@EmbeddedId
    private PrecioproductoEntityKey compositePrimaryKey ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha")
    private Date       fecha        ;

    @Column(name="importe")
    private BigDecimal importe      ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="idproducto", referencedColumnName="idProducto", insertable=false, updatable=false)
    private ProductoEntity producto    ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public PrecioproductoEntity() {
		super();
		this.compositePrimaryKey = new PrecioproductoEntityKey();       
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE COMPOSITE KEY 
    //----------------------------------------------------------------------
    public void setIdprecioproducto( Integer idprecioproducto ) {
        this.compositePrimaryKey.setIdprecioproducto( idprecioproducto ) ;
    }
    public Integer getIdprecioproducto() {
        return this.compositePrimaryKey.getIdprecioproducto() ;
    }
    public void setIdproducto( Integer idproducto ) {
        this.compositePrimaryKey.setIdproducto( idproducto ) ;
    }
    public Integer getIdproducto() {
        return this.compositePrimaryKey.getIdproducto() ;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : fecha ( DATETIME ) 
    public void setFecha( Date fecha ) {
        this.fecha = fecha;
    }
    public Date getFecha() {
        return this.fecha;
    }

    //--- DATABASE MAPPING : importe ( DECIMAL ) 
    public void setImporte( BigDecimal importe ) {
        this.importe = importe;
    }
    public BigDecimal getImporte() {
        return this.importe;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
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
        sb.append(fecha);
        sb.append("|");
        sb.append(importe);
        return sb.toString(); 
    } 

}
