package ParkingSlot.models;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

public class Bill  extends  BaseModel{

    String billId;
    LocalDateTime ExistTime;
    List<Payment> payments;
    Token token;
    Double amount;

    public  Bill(String  parkingId,String billId, LocalDateTime ExistTime, List<Payment> payments, Token token, Double amount ){
        super(parkingId);
        this.billId = billId;
        this.ExistTime = ExistTime;
        this.payments = payments;
        this.token = token;
        this.amount = amount;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public LocalDateTime getExistTime() {
        return ExistTime;
    }

    public void setExistTime(LocalDateTime existTime) {
        ExistTime = existTime;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
