
package buscarUsuarios;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BuscarUsuarios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList <String> listaUsuarios = new ArrayList<>();
        int opc;
        do{
        opc = Integer.parseInt(JOptionPane.showInputDialog("Menu principal \n"
                + "1. Registrar un Usuario\n"
                + "2. Mostrar Usuarios\n"
                + "3. Salir\n "
                + "Digite el numero de la opcion deseada: "));
        
            if (opc == 1){
                 //System.out.print("Ingrese un nombre: ");
                 String nombreU = (JOptionPane.showInputDialog("Ingrese el nombre que desea guardar: "));
                 listaUsuarios.add(nombreU);
            //break;     
            } else if (opc == 2){
                int cant = 1;
                for (String usuario : listaUsuarios){
                    System.out.println("El usuario numero: "+cant+" es: "+usuario);
                    cant++;
                }
            }
        }
        while (opc != 3);
        System.out.println("Saliendo del programa......");
            
        
    }
    
}
