package com.abbasi.springWithoutAop.service;

import com.abbasi.springWithoutAop.model.Song;
import com.abbasi.springWithoutAop.model.Speaker;
import com.abbasi.springWithoutAop.model.Tyre;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
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
        Instant start = Instant.now();
        logger.info("method execution start");
        String music = null;
        if(vehicleStarted){
            music = speaker.makeSound(song);
        }
        else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time took to execute the method: "+timeElapsed);

        return music;
    }

    public String moveVehicle(boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("method execution start");
        String status = null;
        if(vehicleStarted){
            status = tyre.rotate();
        }
        else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time took to execute the method: "+timeElapsed);

        return status;
    }

    public String applyBrake(boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("method execution start");
        String status = null;
        if(vehicleStarted){
            status = tyre.stop();
        }
        else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time took to execute the method: "+timeElapsed);

        return status;
    }
}
