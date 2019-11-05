package com.example.pappu.carandplanecreation;

import com.example.pappu.carandplanecreation.factory.Vehicle;

public class Car implements Vehicle {

    public Car(){
        System.out.println("Car created");
    }

    @Override
    public void set_num_of_passengers(int numPassenger) {
         System.out.println("set number of passenger of Car");
    }

    @Override
    public void set_num_of_wheels(int numWheels) {
        System.out.println("set number of wheels of Car");
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}
