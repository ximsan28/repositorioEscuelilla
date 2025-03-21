package org.floresmateo.model.figura;

public enum FiguraEnum
{
    CUADRADO(1),
    EQUILATERO(2),
    ISOSCELES(3),
    ESCALENO(4),
    CIRCULO(5),
    SALIR(6),
    OPCION_ERRONEA( 7 );
    private Integer id;

    FiguraEnum(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }

    public static FiguraEnum getFiguraEnumById( Integer id )
    {
        return switch (id) {
            case 1 -> CUADRADO;
            case 2 -> EQUILATERO;
            case 3 -> ISOSCELES;
            case 4 -> ESCALENO;
            case 5 -> CIRCULO;
            case 6 -> SALIR;
            default -> OPCION_ERRONEA;
        };
    }
}
