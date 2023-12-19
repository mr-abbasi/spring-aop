package com.abbasi.springWithoutAOP.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speaker{
    @Override
    public String makeSound(Song song) {
        return "Playing the song "+song.getTitle() +" by "+song.getSingerName()+" with sony speaker";
    }
}
