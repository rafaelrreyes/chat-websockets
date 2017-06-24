package com.cassiomolin.example.chat.model.payload;


import com.cassiomolin.example.chat.model.Payload;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.Set;

public class UsersAvailablePayload implements Payload {

    public static final String TYPE = "usersAvailable";

    private Set<String> usernames;

    public Set<String> getUsernames() {
        return usernames;
    }

    public void setUsernames(Set<String> usernames) {
        this.usernames = usernames;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}