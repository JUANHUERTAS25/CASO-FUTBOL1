package ejecutable;

import modelo.Equipo;
import modelo.Jugador;

public class test {
    public static void main(String[] args)
    {
        Equipo Equipo1 = new Equipo("Juventus",2);
        //Jugador Jugador1 = new Jugador("Crisitano", 13, 18);
        Equipo1.cargar();
        System.out.println(Equipo1.toString());
        
    }
    
}
