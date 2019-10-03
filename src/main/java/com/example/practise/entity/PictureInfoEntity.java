package com.example.practise.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Description
 * @Author zhangbing
 * @Date:Created 2019/10/3 12:44
 */
@Entity
@Table(name = "picture_info", schema = "check_car", catalog = "")
public class PictureInfoEntity {
    private int id;
    private String carRelatedId;
    private Timestamp photographTime;
    private String province;
    private String city;
    private String area;
    private String street;
    private String pictureType;
    private String picStoredUrl;
    private String text1;
    private String text2;
    private String text3;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "car_related_id")
    public String getCarRelatedId() {
        return carRelatedId;
    }

    public void setCarRelatedId(String carRelatedId) {
        this.carRelatedId = carRelatedId;
    }

    @Basic
    @Column(name = "photograph_time")
    public Timestamp getPhotographTime() {
        return photographTime;
    }

    public void setPhotographTime(Timestamp photographTime) {
        this.photographTime = photographTime;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "picture_type")
    public String getPictureType() {
        return pictureType;
    }

    public void setPictureType(String pictureType) {
        this.pictureType = pictureType;
    }

    @Basic
    @Column(name = "pic_stored_url")
    public String getPicStoredUrl() {
        return picStoredUrl;
    }

    public void setPicStoredUrl(String picStoredUrl) {
        this.picStoredUrl = picStoredUrl;
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
        PictureInfoEntity that = (PictureInfoEntity) o;
        return id == that.id &&
                Objects.equals(carRelatedId, that.carRelatedId) &&
                Objects.equals(photographTime, that.photographTime) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(area, that.area) &&
                Objects.equals(street, that.street) &&
                Objects.equals(pictureType, that.pictureType) &&
                Objects.equals(picStoredUrl, that.picStoredUrl) &&
                Objects.equals(text1, that.text1) &&
                Objects.equals(text2, that.text2) &&
                Objects.equals(text3, that.text3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, carRelatedId, photographTime, province, city, area, street, pictureType, picStoredUrl, text1, text2, text3);
    }
}
