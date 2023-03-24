package entidades;

import entidades.Pedido;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-23T09:44:57", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> id;
    public static volatile SingularAttribute<Venta, Double> precioVenta;
    public static volatile SingularAttribute<Venta, Pedido> idPedido;
    public static volatile SingularAttribute<Venta, Calendar> fechaVenta;

}