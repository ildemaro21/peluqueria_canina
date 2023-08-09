package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;


public class ControladoraPersistencia {
    
    MascotaJpaController mascotaJPA = new MascotaJpaController();
    DuenioJpaController duenioJPA = new DuenioJpaController();

    public void guardarDatos(Duenio duenio, Mascota mascota) {
        //CREACION DE DUEÑO EN LA BD
        duenioJPA.create(duenio);
        //CREACION DE MASCOTA EN LA BD
        mascotaJPA.create(mascota);
    }

    public List<Mascota> traerMascotas() {
        return mascotaJPA.findMascotaEntities();
    }
 
}
