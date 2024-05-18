package ParkingSlot.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class BaseModel {

    public String id;
    public LocalDateTime createdAt;

    public LocalDateTime updatedAt;


    public BaseModel(String id){
        this.id = id;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public BaseModel(){

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
