package com.rest.pojo;

public class address {
    geo geo;
    private String street;
    private String suite;
    private String city;
    private String zipcode;

    public address(String street,String suite,String city,String zipcode,geo geo1){
        this.street =street;
        this.suite=suite;
        this.city=city;
        this.zipcode=zipcode;
        geo = geo1;
    }

    public com.rest.pojo.geo getGeo() {
        return geo;
    }

    public void setGeo(com.rest.pojo.geo geo) {
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

}
