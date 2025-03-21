package org.floresmateo.vista;

import org.floresmateo.model.figura.Figura;
import org.floresmateo.util.FiguraFactory;
import org.floresmateo.util.ReadUtil;
import org.floresmateo.model.figura.FiguraEnum;
import org.gerdoc.historial.Historiales;

public class Consola implements Ejecutable
{
    private static Consola consola;
    private Historiales historiales;

    private Consola()
    {
    }

    public static Consola getInstance( )
    {
        if(consola==null)
        {
            return new Consola();
        }
        return consola;
    }

    @Override
    public void run( )
    {
        boolean flag = true;
        int opcion = 0;
        FiguraEnum figuraEnum = null;
        Figura figura = null;

        while( flag )
        {
            Menu.principal( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );

            figuraEnum = FiguraEnum.getFiguraEnumById( opcion );

            if( FiguraEnum.SALIR.equals( figuraEnum ) )
            {
                flag = false;
            }
            if( FiguraEnum.OPCION_ERRONEA.equals( figuraEnum ) )
            {
                Menu.opcionInvalida( );
            }
            figura = FiguraFactory.getFiguraByFiguraEnum( figuraEnum );
            if( figura != null )
            {
                ((SolicitaDatos)figura).leeDatos( );
                Menu.calcula( figura );
                if(historiales!=null)
                {
                    historiales.addFigura(figura);
                }
            }
        }

    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }
}
