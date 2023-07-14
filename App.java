import java.util.Scanner;

import Servicio.ClienteServicio;
import Servicio.RutinaServicio;

public class App {
    public static void main(String[] args) throws Exception {

        ClienteServicio clienteServ = new ClienteServicio();
        RutinaServicio rutinaServ = new RutinaServicio();
        Scanner scan = new Scanner(System.in);

        // MENÚ
        Boolean opcSalir = false;
        int opc = 0;
        do {
            System.out.println("** MENÚ ** \n1.Cargar cliente. \n2.Actualizar cliente. \n3.Eliminar cliente. \n4. Ver clientes. \n5.Cargar rutina. \n6.Actualizar rutina. \n7.Eliminar rutina. \n8. Ver rutinas. \n9.Salir. ");
            opc = scan.nextInt();
            switch(opc) {
                case 1: clienteServ.registrarCliente(); break;
                case 2: clienteServ.actualizarCliente(); break;
                case 3: clienteServ.eliminarCliente(); break;
                case 4: clienteServ.obtenerClientes(); break;
                case 5: rutinaServ.registrarRutina(); break;
                case 6: rutinaServ.actualizarRutina(); break;
                case 7: rutinaServ.eliminarRutina(); break;
                case 8: rutinaServ.obtenerRutinas(); break;
                case 9: opcSalir = true; break;
            }
        } while (!opcSalir);
    }
}
