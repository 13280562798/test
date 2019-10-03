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
@Table(name = "code_view", schema = "check_car", catalog = "")
public class CodeViewEntity {
    private int codeId;
    private String state;
    private Timestamp startdate;
    private Timestamp enddate;
    private Timestamp apptime;
    private Integer parentId;
    private String catalogname;
    private String code;
    private String helpcode;
    private String description;
    private String name;
    private String enname;
    private Integer visible;
    private String unitCode;

    @Id
    @Column(name = "CODE_ID")
    public int getCodeId() {
        return codeId;
    }

    public void setCodeId(int codeId) {
        this.codeId = codeId;
    }

    @Basic
    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "STARTDATE")
    public Timestamp getStartdate() {
        return startdate;
    }

    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    @Basic
    @Column(name = "ENDDATE")
    public Timestamp getEnddate() {
        return enddate;
    }

    public void setEnddate(Timestamp enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "APPTIME")
    public Timestamp getApptime() {
        return apptime;
    }

    public void setApptime(Timestamp apptime) {
        this.apptime = apptime;
    }

    @Basic
    @Column(name = "PARENT_ID")
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "CATALOGNAME")
    public String getCatalogname() {
        return catalogname;
    }

    public void setCatalogname(String catalogname) {
        this.catalogname = catalogname;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "HELPCODE")
    public String getHelpcode() {
        return helpcode;
    }

    public void setHelpcode(String helpcode) {
        this.helpcode = helpcode;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "ENNAME")
    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    @Basic
    @Column(name = "VISIBLE")
    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    @Basic
    @Column(name = "UNIT_CODE")
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeViewEntity that = (CodeViewEntity) o;
        return codeId == that.codeId &&
                Objects.equals(state, that.state) &&
                Objects.equals(startdate, that.startdate) &&
                Objects.equals(enddate, that.enddate) &&
                Objects.equals(apptime, that.apptime) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(catalogname, that.catalogname) &&
                Objects.equals(code, that.code) &&
                Objects.equals(helpcode, that.helpcode) &&
                Objects.equals(description, that.description) &&
                Objects.equals(name, that.name) &&
                Objects.equals(enname, that.enname) &&
                Objects.equals(visible, that.visible) &&
                Objects.equals(unitCode, that.unitCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(codeId, state, startdate, enddate, apptime, parentId, catalogname, code, helpcode, description, name, enname, visible, unitCode);
    }
}
