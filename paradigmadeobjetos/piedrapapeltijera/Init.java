package paradigmadeobjetos.piedrapapeltijera;

class Mano {
    String obtenerJugada() {
        // aca hacemos un numero random
        return "";
    }
}

public class Init {
    public static void main(String[] args) {
        Mano jugador1 = new Mano();
        Mano jugador2 = new Mano();
        
        if (jugador1.obtenerJugada() == jugador2.obtenerJugada()) {
            // volver a jugar
        }
        
    }
}
