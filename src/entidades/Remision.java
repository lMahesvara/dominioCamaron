/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author tonyd
 */
@Entity
@Table(name = "remmisiones")
public class Remision {
    @Id
    @Column(name = "id_remisiones")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cantidad")
    private Integer cantidad;
    
    @Column(name = "precio_compra")
    private double precioCompra;
    
    @Column(name = "fecha_entrada")
    private Calendar fechaEntrada;
    
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido idPedido;
    
    @OneToOne
    @JoinColumn(name = "id_remision")
    private RemisionProducto remisionesProductos;

    public Remision() {
    }

    public Remision(Integer id) {
        this.id = id;
    }

    public Remision(Integer id, Integer cantidad, double precioCompra, Calendar fechaEntrada, Pedido idPedido, RemisionProducto remisionesProductos) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.fechaEntrada = fechaEntrada;
        this.idPedido = idPedido;
        this.remisionesProductos = remisionesProductos;
    }

    public Remision(Integer cantidad, double precioCompra, Calendar fechaEntrada, Pedido idPedido, RemisionProducto remisionesProductos) {
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.fechaEntrada = fechaEntrada;
        this.idPedido = idPedido;
        this.remisionesProductos = remisionesProductos;
    }

    public Remision(Integer cantidad, double precioCompra, Calendar fechaEntrada) {
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.fechaEntrada = fechaEntrada;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Calendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Calendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public RemisionProducto getRemisionesProductos() {
        return remisionesProductos;
    }

    public void setRemisionesProductos(RemisionProducto remisionesProductos) {
        this.remisionesProductos = remisionesProductos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Remision other = (Remision) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Remision{" + "id=" + id + ", cantidad=" + cantidad + ", precioCompra=" + precioCompra + ", fechaEntrada=" + fechaEntrada + ", idPedido=" + idPedido + ", remisionesProductos=" + remisionesProductos + '}';
    }
    
    
}

