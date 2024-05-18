package ParkingSlot.models;

import java.util.List;

public class ParkingLevel extends BaseModel{


    Integer number;
    List<VehicleSlotType> allowedVehicleType;
    List<Slot> slots;
    ParkingSlotStatus status;


    public ParkingLevel(String parkingId,Integer levelNumber, List<VehicleSlotType> allowedVehicleType, List<Slot> slots, ParkingSlotStatus status){
        super(parkingId);
        this.number = levelNumber;
        this.allowedVehicleType = allowedVehicleType;
        this.slots = slots;
        this.status = status;
    }

    public ParkingLevel(Integer levelNumber, List<VehicleSlotType> allowedVehicleType, List<Slot> slots, ParkingSlotStatus status){
        this.number = levelNumber;
        this.allowedVehicleType = allowedVehicleType;
        this.slots = slots;
        this.status = status;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<VehicleSlotType> getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(List<VehicleSlotType> allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public ParkingSlotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingSlotStatus status) {
        this.status = status;
    }

    public Slot getSlot(){

        for (Slot slot : this.getSlots())
        {
            Slot availableSlot = slot.getSlot();
            if (availableSlot != null){
                return  availableSlot;
            }
        }

        return null;
    }
}
