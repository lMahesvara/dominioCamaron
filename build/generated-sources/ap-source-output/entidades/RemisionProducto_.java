package entidades;

import entidades.Producto;
import entidades.Remision;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-23T09:44:57", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(RemisionProducto.class)
public class RemisionProducto_ { 

    public static volatile SingularAttribute<RemisionProducto, Integer> idRemision;
    public static volatile SingularAttribute<RemisionProducto, Integer> id;
    public static volatile SingularAttribute<RemisionProducto, Producto> idProducto;
    public static volatile SingularAttribute<RemisionProducto, Remision> remision;

}