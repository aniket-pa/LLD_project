package ParkingSlot.controller;

import ParkingSlot.models.Gate;
import ParkingSlot.models.ParkingLevel;
import ParkingSlot.models.ParkingSlot;
import ParkingSlot.models.VehicleSlotType;

import java.util.List;

public class ParkingSlotController {

    public static ParkingSlot createParkingSlot(String parkingSlotId, Integer capacity, List<ParkingLevel> levels,
                                                List<Gate> entryGate, List<Gate> existGate, String Location,
                                                List<VehicleSlotType> allowedVehicleType)
    {
       return  ParkingSlot.createInstance()
               .setCapacity(capacity)
               .setLevels(levels)
               .setEntryGate(entryGate)
               .setExistGate(existGate)
               .setAllowedVehicleType(allowedVehicleType)
               .setLocation(Location)
               .build(parkingSlotId);

    }

}

