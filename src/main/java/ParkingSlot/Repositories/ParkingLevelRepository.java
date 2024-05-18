package ParkingSlot.Repositories;

import ParkingSlot.models.ParkingLevel;
import ParkingSlot.models.ParkingSlotStatus;
import ParkingSlot.models.Slot;
import ParkingSlot.models.VehicleSlotType;

import java.util.List;

public class ParkingLevelRepository {

    private final List<VehicleSlotType> allowedVehicleParkingLevel2 = List.of(VehicleSlotType.BIKE,VehicleSlotType.SCOOTY,VehicleSlotType.BICYCLE);

    private final List<VehicleSlotType> allowedVehicleParkingLevel1 = List.of(VehicleSlotType.HATCHBACK,VehicleSlotType.TRUCK,VehicleSlotType.SUV);

    private final List<Slot> parkingLevel1Slots = List.of(
            new Slot(1, VehicleSlotType.SUV, ParkingSlotStatus.EMPTY),
            new Slot(2, VehicleSlotType.SUV, ParkingSlotStatus.EMPTY),
            new Slot(3, VehicleSlotType.SUV, ParkingSlotStatus.EMPTY),
            new Slot(4, VehicleSlotType.HATCHBACK, ParkingSlotStatus.EMPTY),
            new Slot(5, VehicleSlotType.HATCHBACK, ParkingSlotStatus.EMPTY),
            new Slot(6, VehicleSlotType.HATCHBACK, ParkingSlotStatus.EMPTY),
            new Slot(7, VehicleSlotType.TRUCK, ParkingSlotStatus.EMPTY),
            new Slot(8, VehicleSlotType.TRUCK, ParkingSlotStatus.EMPTY),
            new Slot(9, VehicleSlotType.TRUCK, ParkingSlotStatus.EMPTY),
            new Slot(10, VehicleSlotType.MIXED, ParkingSlotStatus.EMPTY)
    );

    private  final  List<Slot> getParkingLevel2Slots = List.of(
            new Slot(1, VehicleSlotType.BIKE, ParkingSlotStatus.EMPTY),
            new Slot(2, VehicleSlotType.BIKE, ParkingSlotStatus.EMPTY),
            new Slot(3, VehicleSlotType.BIKE, ParkingSlotStatus.EMPTY),
            new Slot(4, VehicleSlotType.BIKE, ParkingSlotStatus.EMPTY),
            new Slot(5, VehicleSlotType.SCOOTY, ParkingSlotStatus.EMPTY),
            new Slot(6, VehicleSlotType.SCOOTY, ParkingSlotStatus.EMPTY),
            new Slot(7, VehicleSlotType.BICYCLE, ParkingSlotStatus.EMPTY),
            new Slot(8, VehicleSlotType.BICYCLE, ParkingSlotStatus.EMPTY),
            new Slot(9, VehicleSlotType.BICYCLE, ParkingSlotStatus.EMPTY),
            new Slot(10, VehicleSlotType.BIKE, ParkingSlotStatus.EMPTY)
    );

    private List<ParkingLevel> parkingLevels = List.of(
               new ParkingLevel(1, allowedVehicleParkingLevel1, parkingLevel1Slots , ParkingSlotStatus.EMPTY ),
               new ParkingLevel(2, allowedVehicleParkingLevel2 , getParkingLevel2Slots, ParkingSlotStatus.EMPTY)
            );

    public List<ParkingLevel> getParkingLevelHashMap() {
        return parkingLevels;
    }

    public void setParkingLevelHashMap(List<ParkingLevel> parkingLevelHashMap) {
        this.parkingLevels = parkingLevelHashMap;
    }

    public List<VehicleSlotType> getAllowedVehicleParkingLevel1() {
        return allowedVehicleParkingLevel1;
    }

    public List<VehicleSlotType> getAllowedVehicleParkingLevel2() {
        return allowedVehicleParkingLevel2;
    }

    public List<Slot> getParkingLevel1Slots() {
        return parkingLevel1Slots;
    }

    public List<Slot> getGetParkingLevel2Slots() {
        return getParkingLevel2Slots;
    }

    public List<ParkingLevel> getParkingLevels() {
        return parkingLevels;
    }

    public void setParkingLevels(List<ParkingLevel> parkingLevels) {
        this.parkingLevels = parkingLevels;
    }
}
