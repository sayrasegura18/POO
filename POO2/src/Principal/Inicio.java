package Principal;
import java.util.Scanner;
import Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Persona persona1 = new Persona();
        persona1.pedirDatos();
        persona1.mostrarPersona();
        
        
        String resultadoImc = persona1.calcularImc();
        if (resultadoImc.equals("PESOBAJO")) {
            System.out.println("El peso está por debajo de lo ideal");
        } else if (resultadoImc.equals("PESOIDEAL")) {
            System.out.println("El peso es ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }
        
        
        persona1.mayorEdad();

        lectura.close();
    }

    
}