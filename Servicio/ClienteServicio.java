package Servicio;

import java.util.ArrayList;
import java.util.Scanner;

import Entidad.Cliente;

public class ClienteServicio {

  ArrayList<Cliente> clientes = new ArrayList<>();
  Scanner scan = new Scanner (System.in);

  public void registrarCliente(Cliente cliente){
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
  // clientes.add(cliente);
  }

  public ArrayList<Cliente> obtenerClientes() {
    for(int i = 0; i < clientes.size(); i++) System.out.println(clientes.get(i).toString());
    //     for (Cliente cliente : clientes) {System.out.println(cliente);}
    return clientes;
  }

  public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
    // for(int i = 0; i < clientes.size(); i++) {
    //   if( id == clientes.get(i).getId()) { 
    //     clientes.get(i).setNombre(nombre); 
    //     clientes.get(i).setEdad(edad); 
    //     clientes.get(i).setAltura(altura); 
    //     clientes.get(i).setPeso(peso); 
    //     clientes.get(i).setObjetivo(objetivo);      
    //   }
    // }
    for(Cliente cliente : clientes){
      if(id == cliente.getId()){
          cliente.setNombre(nombre);
          cliente.setAltura(altura);
          cliente.setPeso(peso);
          cliente.setObjetivo(objetivo);
      }
    }

  }

  public void eliminarCliente(int id) {
    for(int i = 0; i < clientes.size(); i++) {
      if(id == clientes.get(i).getId()) clientes.remove(i);
    }
  }

}
