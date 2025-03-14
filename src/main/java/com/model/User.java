package com.model;

import java.io.Serializable;
import java.util.UUID;

public class User implements Serializable {
    private UUID uuid;
    private String username;
    private String password;
    private String email;

    public User() {
        this.uuid = UUID.randomUUID();
    }

    public User(String username, String password, String email) {
        this.uuid = UUID.randomUUID();
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public UUID getUuid() { return uuid; }
    public void setUuid(UUID uuid) { this.uuid = uuid; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}