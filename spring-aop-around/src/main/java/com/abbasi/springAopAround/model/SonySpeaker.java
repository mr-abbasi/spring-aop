package com.abbasi.springAopAround.model;

import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speaker{
    @Override
    public String makeSound(Song song) {
        return "Playing the song "+song.getTitle() +" by "+song.getSingerName()+" with sony speaker";
    }
}
