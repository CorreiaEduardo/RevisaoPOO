package questao5;

/**
 * @author Eduardo C.
 */
public class MotorDemo {
    public static void main(String[] args) {
        Motor[] listaMotores = new Motor[5];
        listaMotores[0] = new Motor("Alpha",500);
        listaMotores[1] = new Motor("Beta",400);
        listaMotores[2] = new Motor("Charlie",300);
        listaMotores[3] = new Motor("Delta",200);
        listaMotores[4] = new Motor("Echo",100);
        
        listaMotores[2].ligar();
        listaMotores[4].ligar();
        listaMotores[3].ligar();
        
        for (Motor motor : listaMotores) {
            if (motor.isLigado() == false) {
                System.out.println(motor.getPotencia());
            }
        }
    }
}
