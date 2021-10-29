package com.example.Reto3back.Interfaz;

import com.example.Reto3back.Entidad.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceReservation extends CrudRepository<Reservation, Integer> {
}
