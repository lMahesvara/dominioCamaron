package entidades;

import entidades.Pedido;
import entidades.RemisionProducto;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-23T09:44:57", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Remision.class)
public class Remision_ { 

    public static volatile SingularAttribute<Remision, Double> precioCompra;
    public static volatile SingularAttribute<Remision, Calendar> fechaEntrada;
    public static volatile SingularAttribute<Remision, RemisionProducto> remisionesProductos;
    public static volatile SingularAttribute<Remision, Integer> id;
    public static volatile SingularAttribute<Remision, Integer> cantidad;
    public static volatile SingularAttribute<Remision, Pedido> idPedido;

}