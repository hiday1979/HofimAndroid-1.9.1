package com.wigitech.yam.model;

import java.util.Date;

public class Jellyfish {

    private String type;
    private String value;
    private String timeStamp;
    private String timeZone;
    private String country;
    private String user;
    private String password;
    private String deviceId;
    private double latitude;
    private double longitude;

    public Jellyfish() {}

    @Override
    public String toString() {
        return '{' +
                "\"type\":" + " \"" + type + "\"" +
                ", \"value\":" + " \"" + value + "\"" +
                ", \"timeStamp\":" + " \"" + timeStamp + "\"" +
                ", \"timeZone\":" + " \"" + timeZone + "\"" +
                ", \"country\":" + " \"" + country + "\"" +
                ", \"user\":" + " \"" + user + "\"" +
                ", \"password\":" + " \"" + password + "\"" +
                ", \"deviceId\":" + " \"" + deviceId + "\"" +
                ", \"latitude\":" + " \"" + latitude + "\"" +
                ", \"longitude\":" + " \"" + longitude + "\"" +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getCountry() {
        return country;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

//    POST http://5.100.253.193:8080/hofim/report/jellyfish
//        BODY:
//        {
//        "type" : "JELLYFISH"
//        "value" : ["NONE", "FEW", "LOTS"]
//        "timeStamp" : [Client Time Stemp],
//        "timeZone" : "Israel",
//        "country" : "Israel",
//        "user" : "TESTING",
//        "password" : "TESTING123",
//        "deviceId" : [the device id],
//        "latitude" :
//        "longitude" :
//        }