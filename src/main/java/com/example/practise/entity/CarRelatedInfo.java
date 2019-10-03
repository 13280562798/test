package com.example.practise.entity;

import java.io.Serializable;
import java.util.Date;

public class CarRelatedInfo implements Serializable {
    private String checkCarNumber;

    private String userid;

    private String carOwner;

    private String vinNumber;

    private String number;

    private Integer hasCarNumberOr;

    private String branch;

    private String employeePhoto;

    private String employeeNumber;

    private Integer hasScratchOr;

    private Integer hasGlassOr;

    private Integer hasAddDeviceOr;

    private Integer hasNotRepairOr;

    private Integer hasRobberyOr;

    private Integer hasFireSelfOr;

    private Integer hasWaterOr;

    private Date starttime;

    private String channel;

    private String insuranceNum;

    private String upSystem;

    private String text1;

    private String text2;

    private String text3;

    private static final long serialVersionUID = 1L;

    public CarRelatedInfo(String checkCarNumber, String userid, String carOwner, String vinNumber, String number, Integer hasCarNumberOr, String branch, String employeePhoto, String employeeNumber, Integer hasScratchOr, Integer hasGlassOr, Integer hasAddDeviceOr, Integer hasNotRepairOr, Integer hasRobberyOr, Integer hasFireSelfOr, Integer hasWaterOr, Date starttime, String channel, String insuranceNum, String upSystem, String text1, String text2, String text3) {
        this.checkCarNumber = checkCarNumber;
        this.userid = userid;
        this.carOwner = carOwner;
        this.vinNumber = vinNumber;
        this.number = number;
        this.hasCarNumberOr = hasCarNumberOr;
        this.branch = branch;
        this.employeePhoto = employeePhoto;
        this.employeeNumber = employeeNumber;
        this.hasScratchOr = hasScratchOr;
        this.hasGlassOr = hasGlassOr;
        this.hasAddDeviceOr = hasAddDeviceOr;
        this.hasNotRepairOr = hasNotRepairOr;
        this.hasRobberyOr = hasRobberyOr;
        this.hasFireSelfOr = hasFireSelfOr;
        this.hasWaterOr = hasWaterOr;
        this.starttime = starttime;
        this.channel = channel;
        this.insuranceNum = insuranceNum;
        this.upSystem = upSystem;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
    }

    public CarRelatedInfo() {
        super();
    }

    public String getCheckCarNumber() {
        return checkCarNumber;
    }

    public void setCheckCarNumber(String checkCarNumber) {
        this.checkCarNumber = checkCarNumber == null ? null : checkCarNumber.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner == null ? null : carOwner.trim();
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber == null ? null : vinNumber.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getHasCarNumberOr() {
        return hasCarNumberOr;
    }

    public void setHasCarNumberOr(Integer hasCarNumberOr) {
        this.hasCarNumberOr = hasCarNumberOr;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getEmployeePhoto() {
        return employeePhoto;
    }

    public void setEmployeePhoto(String employeePhoto) {
        this.employeePhoto = employeePhoto == null ? null : employeePhoto.trim();
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber == null ? null : employeeNumber.trim();
    }

    public Integer getHasScratchOr() {
        return hasScratchOr;
    }

    public void setHasScratchOr(Integer hasScratchOr) {
        this.hasScratchOr = hasScratchOr;
    }

    public Integer getHasGlassOr() {
        return hasGlassOr;
    }

    public void setHasGlassOr(Integer hasGlassOr) {
        this.hasGlassOr = hasGlassOr;
    }

    public Integer getHasAddDeviceOr() {
        return hasAddDeviceOr;
    }

    public void setHasAddDeviceOr(Integer hasAddDeviceOr) {
        this.hasAddDeviceOr = hasAddDeviceOr;
    }

    public Integer getHasNotRepairOr() {
        return hasNotRepairOr;
    }

    public void setHasNotRepairOr(Integer hasNotRepairOr) {
        this.hasNotRepairOr = hasNotRepairOr;
    }

    public Integer getHasRobberyOr() {
        return hasRobberyOr;
    }

    public void setHasRobberyOr(Integer hasRobberyOr) {
        this.hasRobberyOr = hasRobberyOr;
    }

    public Integer getHasFireSelfOr() {
        return hasFireSelfOr;
    }

    public void setHasFireSelfOr(Integer hasFireSelfOr) {
        this.hasFireSelfOr = hasFireSelfOr;
    }

    public Integer getHasWaterOr() {
        return hasWaterOr;
    }

    public void setHasWaterOr(Integer hasWaterOr) {
        this.hasWaterOr = hasWaterOr;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getInsuranceNum() {
        return insuranceNum;
    }

    public void setInsuranceNum(String insuranceNum) {
        this.insuranceNum = insuranceNum == null ? null : insuranceNum.trim();
    }

    public String getUpSystem() {
        return upSystem;
    }

    public void setUpSystem(String upSystem) {
        this.upSystem = upSystem == null ? null : upSystem.trim();
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1 == null ? null : text1.trim();
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2 == null ? null : text2.trim();
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3 == null ? null : text3.trim();
    }
}