package ParkingSlot.Dtos;

import ParkingSlot.models.Operator;
import ParkingSlot.models.VehicleSlotType;

import java.util.Date;

public class TokenIssueDto {


    Integer gateNumber;

    String vehicleId;

    VehicleSlotType vehicleType;

    String parkingId;

    public VehicleSlotType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleSlotType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getParkingId() {
        return parkingId;
    }

    public void setParkingId(String parkingId) {
        this.parkingId = parkingId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(Integer gateNumber) {
        this.gateNumber = gateNumber;
    }
}
