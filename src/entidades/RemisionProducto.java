/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

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
@Table(name = "remisiones_producto")
public class RemisionProducto {
    @Id
    @Column(name = "id_remisionProducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "id_remision")
    private int idRemision;
    
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto idProducto;
    
    @OneToOne
    @JoinColumn(name = "remisiones")
    private Remision remision;    

    public RemisionProducto() {
    }

    public RemisionProducto(Integer id) {
        this.id = id;
    }

    public RemisionProducto(Integer id, int idRemision, Producto idProducto, Remision remision) {
        this.id = id;
        this.idRemision = idRemision;
        this.idProducto = idProducto;
        this.remision = remision;
    }

    public Integer getId() {
        return id;
    }

    public int getIdRemision() {
        return idRemision;
    }

    public void setIdRemision(int idRemision) {
        this.idRemision = idRemision;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Remision getRemision() {
        return remision;
    }

    public void setRemision(Remision remision) {
        this.remision = remision;
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
        final RemisionProducto other = (RemisionProducto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RemisionProducto{" + "id=" + id + ", idRemision=" + idRemision + ", idProducto=" + idProducto + ", remision=" + remision + '}';
    }
    
    
    
}

