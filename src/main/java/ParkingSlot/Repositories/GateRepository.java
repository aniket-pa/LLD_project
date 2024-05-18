package ParkingSlot.Repositories;

import ParkingSlot.models.Gate;
import ParkingSlot.models.GateStatus;
import ParkingSlot.models.GateType;
import ParkingSlot.models.Operator;

import java.util.*;

public class GateRepository {

    private final List<Gate> entryGate = List.of(
            new Gate("mumParkingSlot",1, GateType.ENTRY, GateStatus.OPEN, new Operator("operator1","Santosh")),
            new Gate("mumParkingSlot",2, GateType.ENTRY , GateStatus.OPEN, new Operator("operator2","Sunil"))
    );

    private final List<Gate> existGate = List.of(
            new Gate("mumParkingSlot" ,1, GateType.EXIST, GateStatus.OPEN, new Operator("operator3","Sitaram")),
            new Gate("mumParkingSlot",2, GateType.EXIST , GateStatus.OPEN, new Operator("operator4","gopal"))
    );
    private Map<Integer, Gate> gates = new TreeMap<>();

    public GateRepository(Map<Integer, Gate> gates) {
        this.gates = gates;
    }

    public  GateRepository(){
        for(Gate gate : entryGate){
            gates.put(gate.getNumber(),gate);
        }

        for(Gate gate : existGate){
            gates.put(gate.getNumber(),gate);
        }
    }

    public List<Gate> getEntryGate() {
        return entryGate;
    }

    public List<Gate> getExistGate() {
        return existGate;
    }

    public Map<Integer, Gate> getGates() {
        return gates;
    }

    public void setGates(Map<Integer, Gate> gates) {
        this.gates = gates;
    }


    public Optional<Gate> getGateDetailsByGateNumber(Integer gateNumber){

        if (gates.containsKey(gateNumber)) {
            Gate gate = gates.get(gateNumber);
            return  Optional.of(gate);
        }

        return  Optional.empty();
    }

}
