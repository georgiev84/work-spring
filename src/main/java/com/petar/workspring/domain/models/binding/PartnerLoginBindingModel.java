package com.petar.workspring.domain.models.binding;


public class PartnerLoginBindingModel {
    private int id;
   private String username;
   private String password;

    public PartnerLoginBindingModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
