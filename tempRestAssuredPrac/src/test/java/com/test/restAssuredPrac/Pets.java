package com.test.restAssuredPrac;

import java.util.ArrayList;
import java.util.List;

public class Pets {
    private String id;
    private String name;
    private String status;
    CategoryMembers categoryMembers;
    ArrayList<String> photoURLS;
    ArrayList<tagsMembers> tagsMembersArrayList;

    Pets(String id, String name, String status, ArrayList<String> photoURLS,CategoryMembers categoryMembers
    ,ArrayList<tagsMembers> tagsMembersArrayList){
        this.id =id;
        this.name = name;
        this.status = status;
        this.photoURLS=photoURLS;
        this.categoryMembers=categoryMembers;
        this.tagsMembersArrayList =tagsMembersArrayList;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CategoryMembers getCategoryMembers() {
        return categoryMembers;
    }

    public void setCategoryMembers(CategoryMembers categoryMembers) {
        this.categoryMembers = categoryMembers;
    }

    public ArrayList<String> getPhotoURLS() {
        return photoURLS;
    }

    public void setPhotoURLS(ArrayList<String> photoURLS) {
        this.photoURLS = photoURLS;
    }

    public ArrayList<tagsMembers> getTagsMembersArrayList() {
        return tagsMembersArrayList;
    }

    public void setTagsMembersArrayList(ArrayList<tagsMembers> tagsMembersArrayList) {
        this.tagsMembersArrayList = tagsMembersArrayList;
    }

}
