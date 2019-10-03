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
@Table(name = "config_xml", schema = "check_car", catalog = "")
public class ConfigXmlEntity {
    private int id;
    private String confName;
    private String confValue;
    private String confDesc;
    private String confCreater;
    private int status;
    private Timestamp firstInsertDate;
    private Timestamp lastModifyDate;
    private String txt1;
    private String txt2;
    private String txt3;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "conf_name")
    public String getConfName() {
        return confName;
    }

    public void setConfName(String confName) {
        this.confName = confName;
    }

    @Basic
    @Column(name = "conf_value")
    public String getConfValue() {
        return confValue;
    }

    public void setConfValue(String confValue) {
        this.confValue = confValue;
    }

    @Basic
    @Column(name = "conf_desc")
    public String getConfDesc() {
        return confDesc;
    }

    public void setConfDesc(String confDesc) {
        this.confDesc = confDesc;
    }

    @Basic
    @Column(name = "conf_creater")
    public String getConfCreater() {
        return confCreater;
    }

    public void setConfCreater(String confCreater) {
        this.confCreater = confCreater;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "first_insert_date")
    public Timestamp getFirstInsertDate() {
        return firstInsertDate;
    }

    public void setFirstInsertDate(Timestamp firstInsertDate) {
        this.firstInsertDate = firstInsertDate;
    }

    @Basic
    @Column(name = "last_modify_date")
    public Timestamp getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Timestamp lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    @Basic
    @Column(name = "txt1")
    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    @Basic
    @Column(name = "txt2")
    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    @Basic
    @Column(name = "txt3")
    public String getTxt3() {
        return txt3;
    }

    public void setTxt3(String txt3) {
        this.txt3 = txt3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfigXmlEntity that = (ConfigXmlEntity) o;
        return id == that.id &&
                status == that.status &&
                Objects.equals(confName, that.confName) &&
                Objects.equals(confValue, that.confValue) &&
                Objects.equals(confDesc, that.confDesc) &&
                Objects.equals(confCreater, that.confCreater) &&
                Objects.equals(firstInsertDate, that.firstInsertDate) &&
                Objects.equals(lastModifyDate, that.lastModifyDate) &&
                Objects.equals(txt1, that.txt1) &&
                Objects.equals(txt2, that.txt2) &&
                Objects.equals(txt3, that.txt3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, confName, confValue, confDesc, confCreater, status, firstInsertDate, lastModifyDate, txt1, txt2, txt3);
    }
}
