package com.example.pappu.carandplanecreation.singleton;

import com.example.pappu.carandplanecreation.factory.Vehicle;

public class SingleTonCarCreation implements Vehicle {

    private SingleTonCarCreation(){

    }

    private static SingleTonCarCreation singleToneCarCreation = null;

    public static SingleTonCarCreation getInstance(){

        if(singleToneCarCreation==null){
            singleToneCarCreation = new SingleTonCarCreation();
        }
        return singleToneCarCreation;
    }

    @Override
    public void set_num_of_passengers(int numPassenger) {
       System.out.println("Singletone numPassenger " +numPassenger);
    }

    @Override
    public void set_num_of_wheels(int numWheels) {
        System.out.println("Singletone numPassenger " +numWheels);
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}
