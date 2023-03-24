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
import javax.persistence.Table;

/**
 *
 * @author tonyd
 */
@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @Column(name = "id_venta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "precio_venta")
    private double precioVenta;
    
    @Column(name = "fecha")
    private Calendar fechaVenta;
    
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido idPedido;

    public Venta() {
    }

    public Venta(Integer id) {
        this.id = id;
    }

    public Venta(Integer id, double precioVenta, Calendar fechaVenta, Pedido idPedido) {
        this.id = id;
        this.precioVenta = precioVenta;
        this.fechaVenta = fechaVenta;
        this.idPedido = idPedido;
    }

    public Venta(double precioVenta, Calendar fechaVenta, Pedido idPedido) {
        this.precioVenta = precioVenta;
        this.fechaVenta = fechaVenta;
        this.idPedido = idPedido;
    }

    public Integer getId() {
        return id;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Calendar getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Calendar fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
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
        final Venta other = (Venta) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", precioVenta=" + precioVenta + ", fechaVenta=" + fechaVenta + ", idPedido=" + idPedido + '}';
    }
    
}
