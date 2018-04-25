package br.com.simonini.vehiclecrudapi.model.listeners;

import br.com.simonini.vehiclecrudapi.model.Vehicle;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class VehicleEntityListeners {

    @PrePersist
    public void prePersist(Vehicle vehicle) {
        vehicle.setCreatedAt(new Date());
    }

    @PreUpdate
    public void preUpdate(Vehicle vehicle) {
        vehicle.setUpdatedAt(new Date());
    }
}
