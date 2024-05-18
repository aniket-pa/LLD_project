package ParkingSlot.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingSlot extends BaseModel {


    List<ParkingLevel> levels;
    List<Gate> entryGate;
    List<Gate> existGate;
    List<VehicleSlotType> allowedVehicleType;
    String location;
    Integer Capacity;


    private ParkingSlot(String parkingSlotId,ParkingSlotBuilder parkingSlot){

        super(parkingSlotId);
//        this.id = UUID.randomUUID().toString();
        this.levels = parkingSlot.getLevels();
        this.entryGate = parkingSlot.getEntryGate();
        this.existGate = parkingSlot.getExistGate();
        this.allowedVehicleType = List.of(VehicleSlotType.MIXED);
        this.location= "Mumbai_metro";
        this.Capacity = parkingSlot.getCapacity();
    }


    public static class ParkingSlotBuilder{
        String id;

        List<ParkingLevel> levels;
        List<Gate> entryGate;
        List<Gate> existGate;
        List<VehicleSlotType> allowedVehicleType;
        String location;
        Integer Capacity;


        public List<ParkingLevel> getLevels() {
            return levels;
        }

        public ParkingSlotBuilder setLevels(List<ParkingLevel> levels) {
            this.levels = levels;
            return  this;
        }

        public List<Gate> getEntryGate() {
            return entryGate;
        }

        public ParkingSlotBuilder setEntryGate(List<Gate> entryGate) {
            this.entryGate = entryGate;
            return this;
        }

        public List<Gate> getExistGate() {
            return existGate;
        }

        public ParkingSlotBuilder setExistGate(List<Gate> existGate) {
            this.existGate = existGate;
            return  this;
        }

        public List<VehicleSlotType> getAllowedVehicleType() {
            return allowedVehicleType;
        }

        public ParkingSlotBuilder setAllowedVehicleType(List<VehicleSlotType> allowedVehicleType) {
            this.allowedVehicleType = allowedVehicleType;
            return  this;
        }

        public String getLocation() {
            return location;
        }

        public ParkingSlotBuilder setLocation(String location) {

            this.location = location;
            return this;
        }

        public Integer getCapacity() {
            return Capacity;
        }

        public ParkingSlotBuilder setCapacity(Integer capacity) {
            Capacity = capacity;
            return  this;
        }

        public  ParkingSlot build(String parkingSlotId){
            // To -Do

            return  new ParkingSlot(parkingSlotId,this);

        }
    }


    public  static ParkingSlotBuilder createInstance(){
        return new ParkingSlotBuilder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ParkingLevel> getLevels() {
        return levels;
    }

    public void setLevels(List<ParkingLevel> levels) {
        this.levels = levels;
    }

    public List<Gate> getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(List<Gate> entryGate) {
        this.entryGate = entryGate;
    }

    public List<Gate> getExistGate() {
        return existGate;
    }

    public void setExistGate(List<Gate> existGate) {
        this.existGate = existGate;
    }

    public List<VehicleSlotType> getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(List<VehicleSlotType> allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCapacity() {
        return Capacity;
    }

    public void setCapacity(Integer capacity) {
        Capacity = capacity;
    }

    public Slot getSlot(Vehicle vehicle) {
        List<ParkingLevel> parkingLevels =   this.getLevels();
        Slot availableParkingSlot = null;

        for (ParkingLevel parkingLevel : parkingLevels)
        {
            if (parkingLevel.getStatus().equals(ParkingSlotStatus.EMPTY) & parkingLevel.getAllowedVehicleType().contains(vehicle.getVehicleType()) )
            {
                availableParkingSlot = parkingLevel.getSlot();
                if (availableParkingSlot !=null){
                    break;
                }
            }
        }

        return  availableParkingSlot;
    }
}
