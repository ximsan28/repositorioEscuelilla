package org.floresmateo.model.figura;

import org.floresmateo.vista.Consola;
import org.gerdoc.vista.Ejecutable;
import org.floresmateo.vista.Ventana;

public enum TipoEjecutable {
    CONSOLA( 1, Consola.getInstance() ),
    VENTANA( 2, Ventana.getInstance() ),
    SALIR( 3, null ),
    OPCION_ERRONEA( 4, null );

    private Integer id;
    private Ejecutable ejecutable;

    TipoEjecutable(Integer id, Ejecutable ejecutable)
    {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId()
    {
        return id;
    }

    public static TipoEjecutable getTipoEjecutableById( int opcion )
    {
        return switch (opcion)
        {
            case 1 -> CONSOLA;
            case 2 -> VENTANA;
            case 3 -> SALIR;
            default -> OPCION_ERRONEA;
        };
    }

    public Ejecutable getEjecutable()
    {
        return ejecutable;
    }
}
