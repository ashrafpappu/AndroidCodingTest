package com.example.pappu.carandplanecreation;

import com.example.pappu.carandplanecreation.factory.Vehicle;

public class Plane implements Vehicle {

    public Plane(){
        System.out.println("Plane created");
    }

    @Override
    public void set_num_of_wheels(int numWheels) {
        System.out.println("set number of passenger of Plane");
    }

    @Override
    public void set_num_of_passengers(int numPassenger) {
        System.out.println("set number of passenger of Plane");
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}
