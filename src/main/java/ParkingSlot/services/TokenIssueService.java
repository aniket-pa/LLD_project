package ParkingSlot.services;

import ParkingSlot.Repositories.GateRepository;
import ParkingSlot.Repositories.ParkingLotRepository;
import ParkingSlot.Repositories.TokenRepository;
import ParkingSlot.Repositories.VehicleRepository;
import ParkingSlot.models.*;

import java.time.LocalDateTime;
import java.util.Optional;

public class TokenIssueService {

    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    ParkingLotRepository parkingLotRepository;

    TokenRepository tokenRepository;
    public TokenIssueService(GateRepository gateRepository, VehicleRepository vehicleRepository,
                             ParkingLotRepository parkingLotRepository, TokenRepository tokenRepository){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.tokenRepository = tokenRepository;
    }


    public Token issueToken(Integer gateNumber, String vehicleNumber, VehicleSlotType vehicleType, String parkingLotId) throws Exception {

          LocalDateTime entryTime = LocalDateTime.now();
        Optional<Gate> gate;
          try {
              gate = gateRepository.getGateDetailsByGateNumber(gateNumber);
          }
          catch(Exception e){
              throw  new Exception("Entered Gate is not present in the repository");
          }

          Optional<Vehicle> vehicleDetails = vehicleRepository.getVehicleDetailsByNumber(vehicleNumber);

          Vehicle savedVehicle;
          if (vehicleDetails.isEmpty()){
              savedVehicle = vehicleRepository.saveVehicle(vehicleNumber,vehicleType);
          }
          else {
              savedVehicle = vehicleDetails.get();
          }


         ParkingSlot parkingSlot =  parkingLotRepository.getParkingLotByGate(gate.get(),parkingLotId);

          Slot availableParkingSlot = parkingSlot.getSlot(savedVehicle);

            if (availableParkingSlot == null)
            {
            throw new RuntimeException("No slots are available");
            }

          Token token = new Token(parkingSlot.getId(),entryTime,
                gateNumber, availableParkingSlot, savedVehicle);

          tokenRepository.setTokenDetails(token.getToken_id(),token);

           return  token;
    }

}
