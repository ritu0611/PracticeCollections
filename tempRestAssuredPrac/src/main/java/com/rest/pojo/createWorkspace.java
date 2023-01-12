package com.rest.pojo;

public class createWorkspace {

    private String name, type, description;
    private String id;

    public createWorkspace() {

    }

    public createWorkspace(String name, String type, String description) {
        this.name = name;
        this.description = description;
        this.type = type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
