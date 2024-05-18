package ParkingSlot.Repositories;

import ParkingSlot.controller.ParkingSlotController;
import ParkingSlot.models.Gate;
import ParkingSlot.models.ParkingLevel;
import ParkingSlot.models.ParkingSlot;
import ParkingSlot.models.VehicleSlotType;

import java.util.*;

public class ParkingLotRepository {

    private Map<String, ParkingSlot> parkingSlotHashMap = new TreeMap<>();

    public Map<String, ParkingSlot> getParkingSlotHashMap() {
        return parkingSlotHashMap;
    }

    public void setParkingSlotHashMap(Map<String, ParkingSlot> parkingSlotHashMap) {
        this.parkingSlotHashMap = parkingSlotHashMap;
    }



    public  void initialiseParkingLot(){

        ParkingLevelRepository parkingLevelRepository = new ParkingLevelRepository();
        List<ParkingLevel> parkingLevels = parkingLevelRepository.getParkingLevels();

        GateRepository gateRepository = new GateRepository();
        List<Gate> entryGate =  gateRepository.getEntryGate();
        List<Gate> existGate =  gateRepository.getExistGate();

        List<VehicleSlotType> allowedVehicleTypeParkingLot = List.of(
                VehicleSlotType.BIKE,
                VehicleSlotType.SCOOTY,
                VehicleSlotType.BICYCLE,
                VehicleSlotType.HATCHBACK,
                VehicleSlotType.MIXED,
                VehicleSlotType.TRUCK,
                VehicleSlotType.SUV
        );
        parkingSlotHashMap.put("MumbaiMetroParkingLot1",
                ParkingSlotController.createParkingSlot(
                        "mumParkingSlot",20,
                        parkingLevels,entryGate, existGate,
                        "mumbai",allowedVehicleTypeParkingLot
                )
        );

    }

    public  ParkingSlot getParkingLotByGate(Gate gate, String parkingLotId){

        ParkingSlot parkingSlot = parkingSlotHashMap.get(parkingLotId);

        List<Gate> entryGate = parkingSlot.getEntryGate();



        if (entryGate.getFirst().getId().contains(gate.getId())){
            return  parkingSlot;
        }

        return null;
    }



}
