package ParkingSlot.models;

import TicTacToc.modules.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Token extends BaseModel{


    String token_id;
    LocalDateTime EntryTime;
    Gate entryGate;

    Integer gateNumber;
    Slot parkingSlot;
    Vehicle vehicle;

    public String getToken_id() {
        return token_id;
    }

    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }
    public Token(String parkingSlotId,LocalDateTime entryTime,  Integer gateNumber , Slot parkingSlot , Vehicle vehicle ){
        super(parkingSlotId);
        this.token_id = UUID.randomUUID().toString();
        this.EntryTime = entryTime;
        this.gateNumber = gateNumber;
        this.parkingSlot = parkingSlot;
        this.vehicle = vehicle;

    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntryTime() {
        return EntryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        EntryTime = entryTime;
    }

    public Slot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(Slot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }


}
