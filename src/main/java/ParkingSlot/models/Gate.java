package ParkingSlot.models;

public class Gate extends BaseModel{

    Integer number;
    GateType type;
    GateStatus status;
    Operator operator;


    public  Gate(String parkingId,Integer number, GateType type, GateStatus status, Operator operator){
        super(parkingId);
        this.number = number;
        this.type = type;
        this.status = status;
        this.operator = operator;
    }

    public  Gate(Integer number, GateType type, GateStatus status, Operator operator){
        this.number = number;
        this.type = type;
        this.status = status;
        this.operator = operator;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
