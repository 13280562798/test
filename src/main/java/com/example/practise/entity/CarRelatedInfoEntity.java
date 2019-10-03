package com.example.practise.entity;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Description
 * @Author zhangbing
 * @Date:Created 2019/10/3 12:44
 */
@Entity
@Table(name = "car_related_info", schema = "check_car", catalog = "")
@Proxy(lazy = false)
public class CarRelatedInfoEntity {
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
    private String checkCarNumber;
    private Timestamp startTime;
    private String channel;
    private String insuranceNum;
    private String upSystem;
    private String text1;
    private String text2;
    private String text3;

    @Basic
    @Column(name = "userid")
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "car_owner")
    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    @Basic
    @Column(name = "vin_number")
    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    @Basic
    @Column(name = "number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "has_car_number_or")
    public Integer getHasCarNumberOr() {
        return hasCarNumberOr;
    }

    public void setHasCarNumberOr(Integer hasCarNumberOr) {
        this.hasCarNumberOr = hasCarNumberOr;
    }

    @Basic
    @Column(name = "branch")
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Basic
    @Column(name = "employee_photo")
    public String getEmployeePhoto() {
        return employeePhoto;
    }

    public void setEmployeePhoto(String employeePhoto) {
        this.employeePhoto = employeePhoto;
    }

    @Basic
    @Column(name = "employee_number")
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Basic
    @Column(name = "has_scratch_or")
    public Integer getHasScratchOr() {
        return hasScratchOr;
    }

    public void setHasScratchOr(Integer hasScratchOr) {
        this.hasScratchOr = hasScratchOr;
    }

    @Basic
    @Column(name = "has_glass_or")
    public Integer getHasGlassOr() {
        return hasGlassOr;
    }

    public void setHasGlassOr(Integer hasGlassOr) {
        this.hasGlassOr = hasGlassOr;
    }

    @Basic
    @Column(name = "has_add_device_or")
    public Integer getHasAddDeviceOr() {
        return hasAddDeviceOr;
    }

    public void setHasAddDeviceOr(Integer hasAddDeviceOr) {
        this.hasAddDeviceOr = hasAddDeviceOr;
    }

    @Basic
    @Column(name = "has_not_repair_or")
    public Integer getHasNotRepairOr() {
        return hasNotRepairOr;
    }

    public void setHasNotRepairOr(Integer hasNotRepairOr) {
        this.hasNotRepairOr = hasNotRepairOr;
    }

    @Basic
    @Column(name = "has_robbery_or")
    public Integer getHasRobberyOr() {
        return hasRobberyOr;
    }

    public void setHasRobberyOr(Integer hasRobberyOr) {
        this.hasRobberyOr = hasRobberyOr;
    }

    @Basic
    @Column(name = "has_fire_self_or")
    public Integer getHasFireSelfOr() {
        return hasFireSelfOr;
    }

    public void setHasFireSelfOr(Integer hasFireSelfOr) {
        this.hasFireSelfOr = hasFireSelfOr;
    }

    @Basic
    @Column(name = "has_water_or")
    public Integer getHasWaterOr() {
        return hasWaterOr;
    }

    public void setHasWaterOr(Integer hasWaterOr) {
        this.hasWaterOr = hasWaterOr;
    }

    @Id
    @Column(name = "check_car_number")
    public String getCheckCarNumber() {
        return checkCarNumber;
    }

    public void setCheckCarNumber(String checkCarNumber) {
        this.checkCarNumber = checkCarNumber;
    }

    @Basic
    @Column(name = "startTime")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "channel")
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Basic
    @Column(name = "insurance_num")
    public String getInsuranceNum() {
        return insuranceNum;
    }

    public void setInsuranceNum(String insuranceNum) {
        this.insuranceNum = insuranceNum;
    }

    @Basic
    @Column(name = "up_system")
    public String getUpSystem() {
        return upSystem;
    }

    public void setUpSystem(String upSystem) {
        this.upSystem = upSystem;
    }

    @Basic
    @Column(name = "text1")
    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    @Basic
    @Column(name = "text2")
    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    @Basic
    @Column(name = "text3")
    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarRelatedInfoEntity that = (CarRelatedInfoEntity) o;
        return Objects.equals(userid, that.userid) &&
                Objects.equals(carOwner, that.carOwner) &&
                Objects.equals(vinNumber, that.vinNumber) &&
                Objects.equals(number, that.number) &&
                Objects.equals(hasCarNumberOr, that.hasCarNumberOr) &&
                Objects.equals(branch, that.branch) &&
                Objects.equals(employeePhoto, that.employeePhoto) &&
                Objects.equals(employeeNumber, that.employeeNumber) &&
                Objects.equals(hasScratchOr, that.hasScratchOr) &&
                Objects.equals(hasGlassOr, that.hasGlassOr) &&
                Objects.equals(hasAddDeviceOr, that.hasAddDeviceOr) &&
                Objects.equals(hasNotRepairOr, that.hasNotRepairOr) &&
                Objects.equals(hasRobberyOr, that.hasRobberyOr) &&
                Objects.equals(hasFireSelfOr, that.hasFireSelfOr) &&
                Objects.equals(hasWaterOr, that.hasWaterOr) &&
                Objects.equals(checkCarNumber, that.checkCarNumber) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(channel, that.channel) &&
                Objects.equals(insuranceNum, that.insuranceNum) &&
                Objects.equals(upSystem, that.upSystem) &&
                Objects.equals(text1, that.text1) &&
                Objects.equals(text2, that.text2) &&
                Objects.equals(text3, that.text3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userid, carOwner, vinNumber, number, hasCarNumberOr, branch, employeePhoto, employeeNumber, hasScratchOr, hasGlassOr, hasAddDeviceOr, hasNotRepairOr, hasRobberyOr, hasFireSelfOr, hasWaterOr, checkCarNumber, startTime, channel, insuranceNum, upSystem, text1, text2, text3);
    }
}
