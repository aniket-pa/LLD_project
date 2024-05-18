package ParkingSlot.models;

public class Vehicle extends BaseModel{

    String vehicleNumber;

    VehicleSlotType vehicleType;

    String OwnerName;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleSlotType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleSlotType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
}
