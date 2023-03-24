/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;
import javax.persistence.CascadeType;
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
@Table(name = "pedidosproductos")
public class PedidoProducto {
    @Id
    @Column(name = "id_pedidoProducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cantidad")
    private Integer cantidad;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pedido")
    private Pedido idPedido;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_producto")
    private Producto idProducto;

    public PedidoProducto() {
    }

    public PedidoProducto(Integer id, Integer cantidad, Pedido idPedido, Producto idProducto) {
        this.id = id;
        this.cantidad = cantidad;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
    }

    public PedidoProducto(Integer cantidad, Pedido idPedido, Producto idProducto) {
        this.cantidad = cantidad;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
    }

    public PedidoProducto(Integer cantidad) {
        this.cantidad = cantidad;
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

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final PedidoProducto other = (PedidoProducto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "PedidoProducto{" + "id=" + id + ", cantidad=" + cantidad + ", idPedido=" + idPedido + ", idProducto=" + idProducto + '}';
    }
    
    
}
