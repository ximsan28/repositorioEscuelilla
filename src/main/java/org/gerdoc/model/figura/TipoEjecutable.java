package org.gerdoc.model.figura;

import org.gerdoc.vista.Consola;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Ventana;

public enum TipoEjecutable
{
    CONSOLA( 1, Consola.getInstance() ),
    VENTANA( 2, Ventana.getInstance() ),
    SALIR( 3, null ),
    OPCION_ERRONEA( 4, null ),
    HISTORIAL(5, null ),
    CONSOLA_ANTONIO(6, org.floresmateo.vista.Consola.getInstance()),
    CONSOLA_DIEGO(7, org.hernandezvazquez.vista.Consola.getInstance()),
    VENTANA_ANTONIO(8, org.floresmateo.vista.Ventana.getInstance()),
    VENTANA_DIEGO(9, org.hernandezvazquez.vista.Ventana.getInstance())
    ;

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
        switch( opcion )
        {
            case 1:
                return CONSOLA;
            case 2:
                return VENTANA;
            case 3:
                return HISTORIAL;
            case 4:
                return CONSOLA_ANTONIO;
            case 5:
                return VENTANA_ANTONIO;
            case 6:
                return CONSOLA_DIEGO;
            case 7:
                return VENTANA_DIEGO;
            case 8:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }

    public Ejecutable getEjecutable()
    {
        return ejecutable;
    }
}
