package org.floresmateo.inicio;

import org.floresmateo.model.figura.TipoEjecutable;
import org.floresmateo.util.ReadUtil;
import org.floresmateo.vista.Consola;
import org.floresmateo.vista.Ejecutable;
import org.floresmateo.vista.Menu;
import org.floresmateo.vista.Ventana;

public class Inicio {
    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        TipoEjecutable tipoEjecutable = null;

        while( flag )
        {
            Menu.principal2( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            tipoEjecutable = TipoEjecutable.getTipoEjecutableById( opcion );

            if( TipoEjecutable.SALIR.equals( tipoEjecutable ) )
            {
                flag = false;
            }
            if( TipoEjecutable.OPCION_ERRONEA.equals( tipoEjecutable ) )
            {
                Menu.opcionInvalida( );
            }
            if( tipoEjecutable.getEjecutable( ) != null )
            {
                tipoEjecutable.getEjecutable( ).run( );
            }

        }
    }
}