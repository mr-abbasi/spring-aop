package com.abbasi.springWithoutAop;

import com.abbasi.springWithoutAop.config.ProjectConfig;
import com.abbasi.springWithoutAop.model.Song;
import com.abbasi.springWithoutAop.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicleService = context.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());
        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");
        boolean vehicleStarted = true;
        String playMusicStatus = vehicleService.playMusic(vehicleStarted, song);
        String moveStatus = vehicleService.moveVehicle(vehicleStarted);
        String applyBrakeStatus = vehicleService.applyBrake(vehicleStarted);
        System.out.println(playMusicStatus);
        System.out.println(moveStatus);
        System.out.println(applyBrakeStatus);
    }
}
