package ParkingSlot;

import ParkingSlot.Dtos.TokenIssueDto;
import ParkingSlot.Dtos.TokenResponseDto;
import ParkingSlot.Repositories.GateRepository;
import ParkingSlot.Repositories.ParkingLotRepository;
import ParkingSlot.Repositories.TokenRepository;
import ParkingSlot.Repositories.VehicleRepository;
import ParkingSlot.controller.ParkingSlotController;
import ParkingSlot.controller.TokenController;
import ParkingSlot.models.*;
import ParkingSlot.services.TokenIssueService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class client {

    public static void main(String[] args) throws ParseException {

        ParkingLotRepository parkingLotRepositoryDB = new ParkingLotRepository();
        parkingLotRepositoryDB.initialiseParkingLot();

        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TokenRepository tokenRepository = new TokenRepository();

        TokenIssueService tokenIssueService = new TokenIssueService(gateRepository,vehicleRepository,parkingLotRepositoryDB,tokenRepository);
        TokenIssueDto tokenIssueDto = new TokenIssueDto();
        TokenResponseDto tokenResponseDto = new TokenResponseDto();


        tokenIssueDto.setParkingId("MumbaiMetroParkingLot1");
        tokenIssueDto.setGateNumber(1);
        tokenIssueDto.setVehicleId("MH03DK2006");
        tokenIssueDto.setVehicleType(VehicleSlotType.HATCHBACK);

        try {
            TokenController tokenController = new TokenController(tokenIssueService,tokenIssueDto,tokenResponseDto);
            TokenResponseDto generatedTokenResponse =  tokenController.issueToken();

            System.out.println("Token generation process" + generatedTokenResponse.getStatus());
            System.out.println("Token generated Successfully token ID: "+generatedTokenResponse.getToken_id());
        }
        catch (Exception e){
            System.out.println("Thanks for visting but currently"+e.getMessage());
        }


    }
}
