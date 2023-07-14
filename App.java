import java.util.Scanner;

import Entidad.Cliente;
import Entidad.Rutina;
import Servicio.ClienteServicio;
import Servicio.RutinaServicio;

public class App {
    public static void main(String[] args) throws Exception {

        ClienteServicio clienteServ = new ClienteServicio();
        RutinaServicio rutinaServ = new RutinaServicio();
        // MENU
        Scanner scan = new Scanner(System.in);
        Boolean opcSalir = false;
        int opc = 0;
        do {
            System.out.println("Ingrese la opción: \n1.Cargar cliente. \n2.Actualizar cliente. \n3.Eliminar cliente. \n4. Ver clientes. \n5.Cargar rutina. \n6.Actualizar rutina. \n7.Eliminar rutina. \n8. Ver rutinas. \n9.Salir. ");
            opc = scan.nextInt();
            switch(opc) {
                case 1: clienteServ.registrarCliente(null); break;
                case 2: clienteServ.actualizarCliente(opc, null, opc, opc, opc, null); break;
                case 3: clienteServ.eliminarCliente(opc); break;
                case 4: clienteServ.obtenerClientes(); break;
                case 5: rutinaServ.registrarRutina(null); break;
                case 6: rutinaServ.actualizarRutina(opc, null, opc, null, null); break;
                case 7: rutinaServ.eliminarRutina(opc); break;
                case 8: rutinaServ.obtenerRutinas();
                case 9: opcSalir = true; break;
            }
        } while (opcSalir == false);

        // Cliente a= new Cliente(41,"santiago",30,1.75,70,"dormir");
        // Cliente b= new Cliente(31,"julieta",27,1.70,56,"comer");
        // Cliente c= new Cliente(21,"deisy",107,0.75,30,"moverse");

        // Rutina aa= new Rutina(41, "Santiago",45,"facil","Cerrar los ojos y dormir");
        // Rutina bb= new Rutina(31, "Julieta",30,"facil","Abrir la boca y comer");
        // Rutina cc= new Rutina(21, "Deisy",25,"dificil","conseguir exoesqueleto hidraulico");

        // clienteServ.registrarCliente(a);
        // clienteServ.registrarCliente(b);
        // clienteServ.registrarCliente(c);

        // clienteServ.obtenerClientes();
        // clienteServ.actualizarCliente(41, "Lola", 34, 1.60, 54, "entrenar");
        // clienteServ.obtenerClientes();

        // rutinaServ.registrarRutina(cc);

    }
}
