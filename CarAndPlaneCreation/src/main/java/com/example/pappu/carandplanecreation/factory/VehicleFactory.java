package com.example.pappu.carandplanecreation.factory;

import com.example.pappu.carandplanecreation.Car;
import com.example.pappu.carandplanecreation.Plane;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType){

        if(vehicleType == null){
            return null;
        }

        if(vehicleType.equalsIgnoreCase("car")){
            Car car = new Car();
            return car;
        }

        if(vehicleType.equalsIgnoreCase("plane")){
            Plane car = new Plane();
            return car;
        }

        return null;

    }
}
