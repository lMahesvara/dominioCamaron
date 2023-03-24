/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author tonyd
 */
@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @Column(name = "id_pedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "precio_total")
    private double precioTotal;
    
    @Column(name = "fecha_entrega")
    private Calendar fecha;
    
    @Column(name = "lugar_entrega")
    private String lugarEntrega;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="idPedido")
    private List<PedidoProducto> pedidosProducto;
        
    @OneToMany(cascade = CascadeType.ALL, mappedBy="idPedido")
    private List<Venta> ventas;
    
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(Integer id) {
        this.id = id;
    }

    public Pedido(Integer id, double precioTotal, List<PedidoProducto> pedidosProducto, List<Venta> ventas, Cliente cliente) {
        this.id = id;
        this.precioTotal = precioTotal;
        this.pedidosProducto = pedidosProducto;
        this.ventas = ventas;
        this.cliente = cliente;
    }

    public Pedido(double precioTotal, List<PedidoProducto> pedidosProducto, List<Venta> ventas, Cliente cliente) {
        this.precioTotal = precioTotal;
        this.pedidosProducto = pedidosProducto;
        this.ventas = ventas;
        this.cliente = cliente;
    }

    public Pedido(double precioTotal, Cliente cliente) {
        this.precioTotal = precioTotal;
        this.cliente = cliente;
    }

    public Pedido(double precioTotal, Calendar fecha, String lugarEntrega) {
        this.precioTotal = precioTotal;
        this.fecha = fecha;
        this.lugarEntrega = lugarEntrega;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public List<PedidoProducto> getPedidosProducto() {
        return pedidosProducto;
    }

    public void setPedidosProducto(List<PedidoProducto> pedidosProducto) {
        this.pedidosProducto = pedidosProducto;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getLugarEntrega() {
        return lugarEntrega;
    }

    public void setLugarEntrega(String lugarEntrega) {
        this.lugarEntrega = lugarEntrega;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Pedido other = (Pedido) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", precioTotal=" + precioTotal + ", pedidosProducto=" + pedidosProducto + ", ventas=" + ventas + ", cliente=" + cliente + '}';
    }
}
    