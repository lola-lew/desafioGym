package Servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Entidad.Cliente;

public class ClienteServicio {

  ArrayList<Cliente> clientes = new ArrayList<>();
  Scanner scan = new Scanner (System.in);
  
  public void registrarCliente(){
    Cliente cli = new Cliente();
        System.out.println("");
        System.out.println("id: ");
        cli.setId(scan.nextInt());
        scan.nextLine();
        System.out.println("Nombre: ");
        cli.setNombre(scan.next());
        System.out.println("Edad: ");
        cli.setEdad(scan.nextInt());
        scan.nextLine();
        System.out.println("Altura: ");
        cli.setAltura(scan.nextDouble());
        System.out.println("Peso: ");
        cli.setPeso(scan.nextInt());
        scan.nextLine();
        System.out.println("Objetivo: ");
        cli.setObjetivo(scan.nextLine());

        clientes.add(cli);
  }

  public ArrayList<Cliente> obtenerClientes() {
    for (Cliente cliente : clientes) System.out.println(cliente);
    return clientes;
  }

  public void actualizarCliente() {
    System.out.println("Que cliente desea actualizar? Número de id: ");
    int id = scan.nextInt();
    scan.nextLine();

    for(Cliente cliente : clientes){
      if(id == cliente.getId()){
        System.out.println("Nombre: ");
        cliente.setNombre(scan.next());
        System.out.println("Edad: ");
        cliente.setEdad(scan.nextInt());
        scan.nextLine();
        System.out.println("Altura: ");
        cliente.setAltura(scan.nextDouble());
        System.out.println("Peso: ");
        cliente.setPeso(scan.nextInt());
        scan.nextLine();
        System.out.println("Objetivo: ");
        cliente.setObjetivo(scan.nextLine());
        System.out.println("Cliente actualizado!");
      } else {
        System.out.println("El id ingresado no es válido.");
      }
    }
  }

  public void eliminarCliente() {
    System.out.println("Que cliente desea eliminar? Número de id: ");
    int id = scan.nextInt();
    scan.nextLine();

    Iterator<Cliente> iterador = clientes.iterator();

    while (iterador.hasNext()) {
        Cliente cliente = iterador.next();
        if (id == cliente.getId()) {
            iterador.remove();
            System.out.println("Cliente eliminado exitosamente.");
            break;
        }
        System.out.println("No se encontró ningún cliente con el ID especificado.");
    }
  }

}
