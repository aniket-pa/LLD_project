package ParkingSlot.Repositories;

import ParkingSlot.models.Token;

import java.util.Map;
import java.util.TreeMap;

public class TokenRepository {

    public Map<String, Token> tokenDetails = new TreeMap<>();

    public Map<String, Token> getTokenDetails() {
        return tokenDetails;
    }

    public void setTokenDetails(String token_id , Token token) {

        tokenDetails.put(token_id,token);
    }


}
