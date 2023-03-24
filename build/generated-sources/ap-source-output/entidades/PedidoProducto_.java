package entidades;

import entidades.Pedido;
import entidades.Producto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-23T09:44:57", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(PedidoProducto.class)
public class PedidoProducto_ { 

    public static volatile SingularAttribute<PedidoProducto, Integer> id;
    public static volatile SingularAttribute<PedidoProducto, Integer> cantidad;
    public static volatile SingularAttribute<PedidoProducto, Producto> idProducto;
    public static volatile SingularAttribute<PedidoProducto, Pedido> idPedido;

}