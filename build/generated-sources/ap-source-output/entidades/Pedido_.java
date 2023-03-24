package entidades;

import entidades.Cliente;
import entidades.PedidoProducto;
import entidades.Venta;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-23T09:44:57", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Calendar> fecha;
    public static volatile SingularAttribute<Pedido, Cliente> cliente;
    public static volatile ListAttribute<Pedido, PedidoProducto> pedidosProducto;
    public static volatile ListAttribute<Pedido, Venta> ventas;
    public static volatile SingularAttribute<Pedido, String> lugarEntrega;
    public static volatile SingularAttribute<Pedido, Integer> id;
    public static volatile SingularAttribute<Pedido, Double> precioTotal;

}