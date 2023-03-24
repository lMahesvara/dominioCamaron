/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author tonyd
 */
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @Column(name = "id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "cantidad")
    private Integer cantidad;
    
    @Column(name = "cantidad_apartada")
    private Integer cantidadApartada;
    
    @Column(name = "precio")
    private double precio;    

    @OneToMany(fetch = FetchType.EAGER, cascade ={CascadeType.PERSIST, CascadeType.DETACH}, mappedBy="idProducto")
    private List<RemisionProducto> pedidos;

    @OneToMany(fetch = FetchType.EAGER, cascade ={CascadeType.PERSIST, CascadeType.DETACH}, mappedBy="idProducto")
    private List<PedidoProducto> pedidosProductos;

    public Producto() {
    }

    public Producto(Integer id) {
        this.id = id;
    }

    public Producto(Integer id, String nombre, Integer cantidad, double precio, List<RemisionProducto> pedidos, List<PedidoProducto> pedidosProductos) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.pedidos = pedidos;
        this.pedidosProductos = pedidosProductos;
    }

    public Producto(String nombre, Integer cantidad, double precio, List<RemisionProducto> pedidos, List<PedidoProducto> pedidosProductos) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.pedidos = pedidos;
        this.pedidosProductos = pedidosProductos;
    }

    public Producto(String nombre, Integer cantidad, double precio, List<PedidoProducto> pedidosProductos) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.pedidosProductos = pedidosProductos;
    }

    public Producto(String nombre, Integer cantidad, Integer cantidadApartada, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cantidadApartada = cantidadApartada;
        this.precio = precio;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<RemisionProducto> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<RemisionProducto> pedidos) {
        this.pedidos = pedidos;
    }

    public List<PedidoProducto> getPedidosProductos() {
        return pedidosProductos;
    }

    public void setPedidosProductos(List<PedidoProducto> pedidosProductos) {
        this.pedidosProductos = pedidosProductos;
    }

    public Integer getCantidadApartada() {
        return cantidadApartada;
    }

    public void setCantidadApartada(Integer cantidadApartada) {
        this.cantidadApartada = cantidadApartada;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Producto other = (Producto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", pedidos=" + pedidos + ", pedidosProductos=" + pedidosProductos + '}';
    }
}
