import com.example.pappu.carandplanecreation.factory.VehicleFactory;
import com.example.pappu.carandplanecreation.singleton.SingleTonCarCreation;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreationaldesignPatterntTest {

    static VehicleFactory vehicleFactory = null;

    @BeforeAll
    static void init(){
        vehicleFactory = new VehicleFactory();
    }

    @DisplayName("Car object create with factory pattern")
    @Test
    public void carObjectCreate(){

        assertNotEquals(null,vehicleFactory.getVehicle("car"));

    }

    @DisplayName("Plane object create with factory pattern")
    @Test
    public void planeObjectCreate(){

        assertNotEquals(null,vehicleFactory.getVehicle("plane"));

    }

    @DisplayName("null check factory pattern ")
    @Test
    public void nullCheckFactory(){

        assertEquals(null,vehicleFactory.getVehicle(null));
        assertEquals(null,vehicleFactory.getVehicle("sgfd"));

    }


    @DisplayName("Car object create with singleton pattern ")
    @Test
    public void carPassengerSet(){

        assertFalse(SingleTonCarCreation.getInstance().has_gas());

    }


}
