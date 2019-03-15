package paradigmadeobjetos.ruleta;

class Ruleta {
    int[] numeros;
    int[] docenas;
    String[] colores;
    
    public Ruleta() {
        numeros = new int[37];
        docenas = new int[3];
        colores = new String[2];
    }
    public void apostarColor(String color, int cantidad) {        
    }
    public void apostarNumero(int numero, int cantidad) {
    }
    public void apostarDocena(int nroDocena, int cantidad) {        
    }
    private void evaluarCuantoSePagaDeRojo() {
        
    }
    private void evaluarCuantoSePagaDeNegro() {
        
    }
    private void evaluarCuantoSePagaNumeroGanador() {
        
    }
    private void evaluarDocena() {
        
    }
    public void tirarBolilla() {
        int numeroObtenido = new java.util.Random().nextInt(37);
        System.out.println("Salio el: " + numeroObtenido);
    }
}


public class Init {
    public static void main(String[] args) {
        Ruleta ruleta = new Ruleta();
        ruleta.tirarBolilla();
    }
}
