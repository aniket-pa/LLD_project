package ParkingSlot.models;

public class Slot  extends BaseModel{


    Integer slotNumber;
    VehicleSlotType slotType;
    ParkingSlotStatus status;

    public Slot(String parkingId,Integer slotNumber, VehicleSlotType slotType, ParkingSlotStatus status){
        super(parkingId);
        this.slotNumber = slotNumber;
        this.slotType = slotType;
        this.status = status;
    }

    public Slot(Integer slotNumber, VehicleSlotType slotType, ParkingSlotStatus status){
        this.slotNumber = slotNumber;
        this.slotType = slotType;
        this.status = status;
    }



    public Integer getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(Integer slotNumber) {
        this.slotNumber = slotNumber;
    }

    public VehicleSlotType getSlotType() {
        return slotType;
    }

    public void setSlotType(VehicleSlotType slotType) {
        this.slotType = slotType;
    }

    public ParkingSlotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingSlotStatus status) {
        this.status = status;
    }


    public Slot getSlot(){

        if (this.getStatus().equals(ParkingSlotStatus.EMPTY))
        {
            this.status = ParkingSlotStatus.OCCUPIED;
            return this;
        }

        return null;
    }
}
