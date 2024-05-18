package ParkingSlot.controller;

import ParkingSlot.Dtos.ResponseStatus;
import ParkingSlot.Dtos.TokenIssueDto;
import ParkingSlot.Dtos.TokenResponseDto;
import ParkingSlot.models.*;
import ParkingSlot.services.TokenIssueService;

import java.util.Date;
import java.util.List;

public class TokenController {

    public TokenIssueService tokenIssueService;
    public TokenResponseDto tokenResponseDto;

    public TokenIssueDto tokenIssueDto;
    public TokenController(TokenIssueService tokenIssueService, TokenIssueDto tokenIssueDto,TokenResponseDto tokenResponseDto ){

        this.tokenIssueService = tokenIssueService;
        this.tokenResponseDto = tokenResponseDto;
        this.tokenIssueDto =tokenIssueDto;
    }

    public TokenResponseDto issueToken(){

        try{
           Token generatedToken =  tokenIssueService.issueToken(tokenIssueDto.getGateNumber(), tokenIssueDto.getVehicleId(),tokenIssueDto.getVehicleType(),tokenIssueDto.getParkingId());
           tokenResponseDto.setToken_id(generatedToken.getToken_id());
           tokenResponseDto.setToken(generatedToken);
           tokenResponseDto.setStatus(ResponseStatus.PASSED);
        }
        catch (Exception e){
            tokenResponseDto.setStatus(ResponseStatus.FAILED);
            tokenResponseDto.setFailedResponseMessage("Token not generated because "+e.getMessage());
        }

        return tokenResponseDto;

    }


}
