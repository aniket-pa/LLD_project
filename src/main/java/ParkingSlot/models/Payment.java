package ParkingSlot.models;

import java.sql.Date;
import java.time.LocalDateTime;

public class Payment  extends BaseModel{

    String referenceNumber;
    Double amount;
    PaymentModeType mode;
    LocalDateTime time;



    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public PaymentModeType getMode() {
        return mode;
    }

    public void setMode(PaymentModeType mode) {
        this.mode = mode;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
