package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


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

    public void eliminarMascota(int idMascota) {
        try {
            mascotaJPA.destroy(idMascota);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
