package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia ctrlPersistencia = new ControladoraPersistencia();

    public void guardarDatos(String nombre, String raza, String color, String alergico, String atencion, String nombreD, 
            String telefono, String observacion) {
        //CREACION DE DUEÑO Y ASIGNACION DE VALORES
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreD);
        duenio.setTelefono(telefono);
        duenio.setObservacion(observacion);
        
        //CREACION DE MASCOTA Y ASIGNACION DE VALORES
        Mascota mascota = new Mascota();
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionE(atencion);
        mascota.setDuenio(duenio);
        
        ctrlPersistencia.guardarDatos(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        return ctrlPersistencia.traerMascotas();
    }

    public void eliminarMascota(int idMascota) {
        ctrlPersistencia.eliminarMascota(idMascota);
    }
    

}
