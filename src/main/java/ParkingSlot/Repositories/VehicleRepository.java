package ParkingSlot.Repositories;

import ParkingSlot.models.Vehicle;
import ParkingSlot.models.VehicleSlotType;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {

    private Map<String, Vehicle> vehicleDetails = new TreeMap<>();


    public Optional<Vehicle> getVehicleDetailsByNumber(String vehicleNumber){

        if (vehicleDetails.containsKey(vehicleNumber)) {
            return Optional.of(vehicleDetails.get(vehicleNumber));
        }

        return  Optional.empty();
    }


    public Vehicle saveVehicle(String vehicleNumber, VehicleSlotType vehicleType){

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleNumber(vehicleNumber);
        vehicle.setVehicleType(vehicleType);
        vehicleDetails.put(vehicleNumber, vehicle );

        return vehicle;
    }



}
