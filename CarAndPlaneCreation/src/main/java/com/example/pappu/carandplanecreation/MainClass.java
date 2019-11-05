package com.example.pappu.carandplanecreation;

import com.example.pappu.carandplanecreation.factory.Vehicle;
import com.example.pappu.carandplanecreation.factory.VehicleFactory;
import com.example.pappu.carandplanecreation.singleton.SingleTonCarCreation;

public class MainClass {

    public  static void main(String[] args){

        SingleTonCarCreation.getInstance().set_num_of_passengers(5);
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.getVehicle("Car");
        Vehicle plane = vehicleFactory.getVehicle("plane");

    }
}
