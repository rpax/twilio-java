package com.twilio.jwt.accesstoken;


import java.util.Map;

public class PlayerGrant implements Grant {

    Map<String, Object> payload;

    public PlayerGrant setPayload(Map<String, Object> payload) {
        this.payload = payload;
        return this;
    }

    @Override
    public String getGrantKey() {
        return "player";
    }

    @Override
    public Object getPayload() {
        return payload;
    }
}
