/*
 * Created on 8 oct 2016 ( Time 23:53:14 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package org.salondeventas.server.modelo.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "venta"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="venta", catalog="salon_de_ventas" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="VentaEntity.countAll", query="SELECT COUNT(x) FROM VentaEntity x" )
} )
public class VentaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="idVenta", nullable=false)
    private Integer    idventa      ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha", nullable=false)
    private Date       fecha        ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_pago")
    private Date       fechaPago    ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="venta", targetEntity=LineadeventaEntity.class)
    private List<LineadeventaEntity> listOfLineadeventa;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public VentaEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdventa( Integer idventa ) {
        this.idventa = idventa ;
    }
    public Integer getIdventa() {
        return this.idventa;
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

    //--- DATABASE MAPPING : fecha_pago ( DATETIME ) 
    public void setFechaPago( Date fechaPago ) {
        this.fechaPago = fechaPago;
    }
    public Date getFechaPago() {
        return this.fechaPago;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setListOfLineadeventa( List<LineadeventaEntity> listOfLineadeventa ) {
        this.listOfLineadeventa = listOfLineadeventa;
    }
    public List<LineadeventaEntity> getListOfLineadeventa() {
        return this.listOfLineadeventa;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(idventa);
        sb.append("]:"); 
        sb.append(fecha);
        sb.append("|");
        sb.append(fechaPago);
        return sb.toString(); 
    } 

}
