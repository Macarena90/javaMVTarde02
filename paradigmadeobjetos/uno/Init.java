package paradigmadeobjetos.uno;

class ClaseEjemplo {
    private String Nombre = "Adrian";
    public void mostrarNombre() {
        System.out.println(Nombre);
    }
}

public class Init {
    public static void main(String[] args) {
        ClaseEjemplo miVariable = new ClaseEjemplo();
        miVariable.mostrarNombre();
    }
}
