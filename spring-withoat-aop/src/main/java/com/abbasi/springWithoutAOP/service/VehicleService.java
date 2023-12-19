package com.abbasi.springWithoutAOP.service;

import com.abbasi.springWithoutAOP.model.Song;
import com.abbasi.springWithoutAOP.model.Speaker;
import com.abbasi.springWithoutAOP.model.Tyre;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleService {

    private Logger LOG = Logger.getLogger(VehicleService.class.getName());
    private final Speaker speaker;
    private final Tyre tyre;

    public VehicleService(Speaker speaker, Tyre tyre) {
        this.speaker = speaker;
        this.tyre = tyre;
    }

    public String playMusic(boolean vehicleStarted, Song song) {
        Instant start = Instant.now();
        LOG.info("method execution start");
        String music = null;
        if(vehicleStarted){
            music = speaker.makeSound(song);
        }
        else{
            LOG.log(Level.SEVERE,"Vehicle not started to perform the operation");
        }
        LOG.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        LOG.info("Time took to execute the method: "+timeElapsed);

        return music;
    }

    public String moveVehicle(boolean vehicleStarted){
        Instant start = Instant.now();
        LOG.info("method execution start");
        String status = null;
        if(vehicleStarted){
            status = tyre.rotate();
        }
        else{
            LOG.log(Level.SEVERE,"Vehicle not started to perform the operation");
        }
        LOG.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        LOG.info("Time took to execute the method: "+timeElapsed);

        return status;
    }

    public String applyBrake(boolean vehicleStarted){
        Instant start = Instant.now();
        LOG.info("method execution start");
        String status = null;
        if(vehicleStarted){
            status = tyre.stop();
        }
        else{
            LOG.log(Level.SEVERE,"Vehicle not started to perform the operation");
        }
        LOG.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        LOG.info("Time took to execute the method: "+timeElapsed);

        return status;
    }
}
