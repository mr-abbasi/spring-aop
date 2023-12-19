package com.abbasi.springWithoutAOP.model;

import org.springframework.stereotype.Component;

@Component
public class MichelineTyre implements Tyre {

    @Override
    public String rotate() {
        return "Vehicle is moving with the help of Michelin tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of Michelin tyres";
    }
}
