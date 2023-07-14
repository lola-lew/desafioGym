package Servicio;

import java.util.ArrayList;
import java.util.Scanner;

import Entidad.Cliente;
import Entidad.Rutina;

public class RutinaServicio {
  ArrayList<Rutina> rutinas = new ArrayList<>();
  Scanner scan = new Scanner (System.in);

  public void registrarRutina(Rutina rutina){
  rutinas.add(rutina);
  }

  public ArrayList<Rutina> obtenerRutinas() {
    for(int i = 0; i < rutinas.size(); i++) System.out.println(rutinas.get(i).toString());
    //     for (Rutina rutina : rutinas) {System.out.println(rutina);}
    return rutinas;
  }

  public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
    // for(int i = 0; i < rutinas.size(); i++) {
    //   if( id == rutinas.get(i).getId()) { 
    //     rutinas.get(i).setNombre(nombre); 
    //     rutinas.get(i).setDuracion(duracion); 
    //     rutinas.get(i).setNivelDificultad(nivelDificultad);
    //     rutinas.get(i).setDescripcion(descripcion);   
    //   }
    // }
      for(Rutina rutina : rutinas){
      if(id == rutina.getId()){
          rutina.setNombre(nombre);
          rutina.setDuracion(duracion);
          rutina.setNivelDificultad(nivelDificultad);
          rutina.setDescripcion(descripcion);
      }
    }

  }

  public void eliminarRutina(int id) {
    for(int i = 0; i < rutinas.size(); i++) {
      if(id == rutinas.get(i).getId()) rutinas.remove(i);
    }
  }
}
