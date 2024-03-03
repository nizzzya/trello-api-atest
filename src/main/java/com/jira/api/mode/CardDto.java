package com.jira.api.mode;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardDto extends Auth {
    public CardDto() {
    }

    public CardDto(String name) {
        this.name = name;
    }

    public CardDto(String idList, String name) {
        this.idList = idList;
        this.name = name;
    }



    @JsonProperty("address")
    private String address;


    @JsonProperty("locationName")
    private String locationName;

    @JsonProperty("idLabels")
    private List<Object> idLabels;

    @JsonProperty("idCardSource")
    private String idCardSource;

    @JsonProperty("start")
    private String start;

    @JsonProperty("dueComplete")
    private boolean dueComplete;

    @JsonProperty("coordinates")
    private String coordinates;

    @JsonProperty("urlSource")
    private String urlSource;

    @JsonProperty("fileSource")
    private String fileSource;

    @JsonProperty("idList")
    private String idList;

    @JsonProperty("mimeType")
    private String mimeType;

    @JsonProperty("idMembers")
    private List<Object> idMembers;

    @JsonProperty("pos")
    private int pos;

    @JsonProperty("due")
    private String due;

    @JsonProperty("name")
    private String name;

    @JsonProperty("keepFromSource")
    private String keepFromSource;

    @JsonProperty("desc")
    private String desc;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setIdLabels(List<Object> idLabels) {
        this.idLabels = idLabels;
    }

    public List<Object> getIdLabels() {
        return idLabels;
    }

    public void setIdCardSource(String idCardSource) {
        this.idCardSource = idCardSource;
    }

    public String getIdCardSource() {
        return idCardSource;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStart() {
        return start;
    }

    public void setDueComplete(boolean dueComplete) {
        this.dueComplete = dueComplete;
    }

    public boolean isDueComplete() {
        return dueComplete;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setUrlSource(String urlSource) {
        this.urlSource = urlSource;
    }

    public String getUrlSource() {
        return urlSource;
    }

    public void setFileSource(String fileSource) {
        this.fileSource = fileSource;
    }

    public String getFileSource() {
        return fileSource;
    }

    public void setIdList(String idList) {
        this.idList = idList;
    }

    public String getIdList() {
        return idList;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setIdMembers(List<Object> idMembers) {
        this.idMembers = idMembers;
    }

    public List<Object> getIdMembers() {
        return idMembers;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public String getDue() {
        return due;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setKeepFromSource(String keepFromSource) {
        this.keepFromSource = keepFromSource;
    }

    public String getKeepFromSource() {
        return keepFromSource;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}