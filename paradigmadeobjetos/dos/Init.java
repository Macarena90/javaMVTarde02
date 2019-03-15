package paradigmadeobjetos.dos;

class Auto {
    private int velocidad = 0;
    private String nombre = null;
    
    public Auto(String nombreParam) {
        velocidad = 40;
        nombre = nombreParam;
    }
    
    public void incrementarVelocidad() {
        velocidad += 10;
    }
    public void mostrarVelocidadActual() {
        System.out.println(velocidad);
    }
    public void setNombre(String nombreParam) {
        nombre = nombreParam;
    }
}

public class Init {
    public static void main(String[] args) {
        Auto[] arrAutos = new Auto[10];
        
        for (int i = 0; i < arrAutos.length; i++) {
            arrAutos[i] = new Auto("Nombre__" + i);
            for (int x=0; x <= i; x++) {
                arrAutos[i].incrementarVelocidad();
            }
            arrAutos[i].mostrarVelocidadActual();
        }
    }
}
