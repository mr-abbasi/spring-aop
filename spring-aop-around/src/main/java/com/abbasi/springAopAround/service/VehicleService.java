package com.abbasi.springAopAround.service;

import com.abbasi.springAopAround.model.Song;
import com.abbasi.springAopAround.model.Speaker;
import com.abbasi.springAopAround.model.Tyre;
import org.springframework.stereotype.Component;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleService {

    private final Logger logger = Logger.getLogger(VehicleService.class.getName());
    private final Speaker speaker;
    private final Tyre tyre;

    public VehicleService(Speaker speaker, Tyre tyre) {
        this.speaker = speaker;
        this.tyre = tyre;
    }

    public String playMusic(boolean vehicleStarted, Song song) {
        String music = null;
        if (vehicleStarted) {
            music = speaker.makeSound(song);
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }

        return music;
    }

    public String moveVehicle(boolean vehicleStarted) {
        String status = null;
        if (vehicleStarted) {
            status = tyre.rotate();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }

        return status;
    }

    public String applyBrake(boolean vehicleStarted) {
        String status = null;
        if (vehicleStarted) {
            status = tyre.stop();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }

        return status;
    }
}
