package ParkingSlot.Dtos;

import ParkingSlot.models.Token;

public class TokenResponseDto {

    Token token;

    String token_id;

    public String getToken_id() {
        return token_id;
    }

    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }

    ResponseStatus status;

    String failedResponseMessage;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getFailedResponseMessage() {
        return failedResponseMessage;
    }

    public void setFailedResponseMessage(String failedResponseMessage) {
        this.failedResponseMessage = failedResponseMessage;
    }
}
