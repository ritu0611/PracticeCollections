package com.rest.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

public class parentJson {
    address address;

    private String name;
    private  String username;
    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;

    public  parentJson(String name, String username, String email,address address1){
        this.name = name;
        this.username = username;
        this.email=email;
        address = address1;
    }
    public com.rest.pojo.address getAddress() {
        return address;
    }

    public void setAddress(com.rest.pojo.address address) {
        this.address = address;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
