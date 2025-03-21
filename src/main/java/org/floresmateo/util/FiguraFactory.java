package org.floresmateo.util;

import org.floresmateo.model.figura.*;
import org.floresmateo.model.figura.figura2.Escaleno;
import org.floresmateo.model.figura.figura2.Isosceles;

public class FiguraFactory
{
    public static Figura getFiguraByFiguraEnum( FiguraEnum figuraEnum )
    {
        switch (figuraEnum)
        {
            case CUADRADO:
                return new Cuadrado( );
            case ESCALENO:
                return new Escaleno( );
            case ISOSCELES:
                return new Isosceles( );
            case EQUILATERO:
                return new Equilatero( );
            case CIRCULO:
                return new Circulo( );
            case OPCION_ERRONEA:
            case SALIR:
            default:
                return null;
        }
    }
}
