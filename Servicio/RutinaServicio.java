package Servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Entidad.Rutina;

public class RutinaServicio {
  ArrayList<Rutina> rutinas = new ArrayList<>();
  Scanner scan = new Scanner (System.in);
  
  public void registrarRutina(){
    Rutina rut = new Rutina();
        System.out.println("");
        System.out.println("id: ");
        rut.setId(scan.nextInt());
        scan.nextLine();
        System.out.println("Nombre: ");
        rut.setNombre(scan.next());
        System.out.println("Duración: ");
        rut.setDuracion(scan.nextInt());
        scan.nextLine();
        System.out.println("Nivel de dificultad: ");
        rut.setNivelDificultad(scan.next());
        scan.nextLine();
        System.out.println("Descripción: ");
        rut.setDescripcion(scan.nextLine());

        rutinas.add(rut);
  }

  public ArrayList<Rutina> obtenerRutinas() {
    for (Rutina rutina : rutinas) System.out.println(rutina);
    return rutinas;
  }

  public void actualizarRutina() {
    System.out.println("Que rutina desea actualizar? Número de id: ");
    int id = scan.nextInt();
    scan.nextLine();

    for(Rutina rutina : rutinas){
      if(id == rutina.getId()){
        System.out.println("Nombre: ");
        rutina.setNombre(scan.next());
        System.out.println("Duración: "); 
        rutina.setDuracion(scan.nextInt());
        scan.nextLine();
        System.out.println("Nivel de dificultad: ");
        rutina.setNivelDificultad(scan.next());
        System.out.println("Descripción: ");
        rutina.setDescripcion(scan.nextLine());
        System.out.println("Rutina actualizada!");
      } else {
        System.out.println("El id ingresado no es válido.");
      }
    }

  }

  public void eliminarRutina() {
    System.out.println("Que rutina desea eliminar? Número de id: ");
    int id = scan.nextInt();
    scan.nextLine();

    Iterator<Rutina> iterador = rutinas.iterator();

    while (iterador.hasNext()) {
        Rutina rutina = iterador.next();
        if (id == rutina.getId()) {
            iterador.remove();
            System.out.println("Rutina eliminada exitosamente.");
            break;
        }
        System.out.println("No se encontró ninguna rutina con el ID especificado.");
    }
  }
}
