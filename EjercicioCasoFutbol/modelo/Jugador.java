package modelo;

public class Jugador
{
    //Atributos
    private String nombre;
    private int edad;
    private int goles;
    private int codigo;

    //Métodos
    public Jugador()
    {
        nombre = "";
        edad= 0;
        goles = 0;
        codigo = 0;
    }

    public Jugador(String n, int g, int e,int c)
    {
        nombre = n;
        goles = g;
        edad = e;
        codigo = c;
    }
    
    public void setGoles(int g)
    {
        goles = g;
    }

    public int getGoles()
    {
        return goles;
    }
    public void setEdad(int e)
    {
        edad = e;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setNombre(String n)
    {
        nombre = n;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setCodigo(int c)
    {
        codigo = c;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public String toString()
    {
        return nombre + " con " + goles + " goles " + edad + " años y su código es: " + codigo;
    }
}