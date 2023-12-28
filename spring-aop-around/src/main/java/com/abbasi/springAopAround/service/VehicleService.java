package com.abbasi.springAopAround.service;

import com.abbasi.springAopAround.model.Song;
import com.abbasi.springAopAround.model.Speaker;
import com.abbasi.springAopAround.model.Tyre;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    private final Speaker speaker;
    private final Tyre tyre;

    public VehicleService(Speaker speaker, Tyre tyre) {
        this.speaker = speaker;
        this.tyre = tyre;
    }

    public String playMusic(boolean vehicleStarted, Song song) {
//        throw new NullPointerException("Null Pointer Exception");
        return speaker.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted) {
        return tyre.rotate();
    }

    public String applyBrake(boolean vehicleStarted) {
        return tyre.stop();
    }
}
