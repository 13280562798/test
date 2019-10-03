package com.example.practise.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Description
 * @Author zhangbing
 * @Date:Created 2019/10/3 12:44
 */
@Entity
@Table(name = "configuration", schema = "check_car", catalog = "")
public class ConfigurationEntity {
    private int id;
    private Integer globalityTime;
    private Integer rephotoTime;
    private Integer scratchTime;
    private Integer glassTime;
    private Integer notRepairTime;
    private Integer addDeviceTime;
    private Integer retransferPhotoTime;
    private Integer globalityNum;
    private int rephotoNum;
    private Integer scratchNum;
    private Integer glassNum;
    private Integer notRepairNum;
    private Integer addDeviceNum;
    private Integer retransferPhotoNum;
    private Integer checkcarnumIndate;
    private Integer retransferPhotoIndate;
    private Integer planNum;
    private Integer checkPlanTime;
    private String checkcarnumRule;
    private Integer submitNum;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "globality_time")
    public Integer getGlobalityTime() {
        return globalityTime;
    }

    public void setGlobalityTime(Integer globalityTime) {
        this.globalityTime = globalityTime;
    }

    @Basic
    @Column(name = "rephoto_time")
    public Integer getRephotoTime() {
        return rephotoTime;
    }

    public void setRephotoTime(Integer rephotoTime) {
        this.rephotoTime = rephotoTime;
    }

    @Basic
    @Column(name = "scratch_time")
    public Integer getScratchTime() {
        return scratchTime;
    }

    public void setScratchTime(Integer scratchTime) {
        this.scratchTime = scratchTime;
    }

    @Basic
    @Column(name = "glass_time")
    public Integer getGlassTime() {
        return glassTime;
    }

    public void setGlassTime(Integer glassTime) {
        this.glassTime = glassTime;
    }

    @Basic
    @Column(name = "not_repair_time")
    public Integer getNotRepairTime() {
        return notRepairTime;
    }

    public void setNotRepairTime(Integer notRepairTime) {
        this.notRepairTime = notRepairTime;
    }

    @Basic
    @Column(name = "add_device_time")
    public Integer getAddDeviceTime() {
        return addDeviceTime;
    }

    public void setAddDeviceTime(Integer addDeviceTime) {
        this.addDeviceTime = addDeviceTime;
    }

    @Basic
    @Column(name = "retransfer_photo_time")
    public Integer getRetransferPhotoTime() {
        return retransferPhotoTime;
    }

    public void setRetransferPhotoTime(Integer retransferPhotoTime) {
        this.retransferPhotoTime = retransferPhotoTime;
    }

    @Basic
    @Column(name = "globality_num")
    public Integer getGlobalityNum() {
        return globalityNum;
    }

    public void setGlobalityNum(Integer globalityNum) {
        this.globalityNum = globalityNum;
    }

    @Basic
    @Column(name = "rephoto_num")
    public int getRephotoNum() {
        return rephotoNum;
    }

    public void setRephotoNum(int rephotoNum) {
        this.rephotoNum = rephotoNum;
    }

    @Basic
    @Column(name = "scratch_num")
    public Integer getScratchNum() {
        return scratchNum;
    }

    public void setScratchNum(Integer scratchNum) {
        this.scratchNum = scratchNum;
    }

    @Basic
    @Column(name = "glass_num")
    public Integer getGlassNum() {
        return glassNum;
    }

    public void setGlassNum(Integer glassNum) {
        this.glassNum = glassNum;
    }

    @Basic
    @Column(name = "not_repair_num")
    public Integer getNotRepairNum() {
        return notRepairNum;
    }

    public void setNotRepairNum(Integer notRepairNum) {
        this.notRepairNum = notRepairNum;
    }

    @Basic
    @Column(name = "add_device_num")
    public Integer getAddDeviceNum() {
        return addDeviceNum;
    }

    public void setAddDeviceNum(Integer addDeviceNum) {
        this.addDeviceNum = addDeviceNum;
    }

    @Basic
    @Column(name = "retransfer_photo_num")
    public Integer getRetransferPhotoNum() {
        return retransferPhotoNum;
    }

    public void setRetransferPhotoNum(Integer retransferPhotoNum) {
        this.retransferPhotoNum = retransferPhotoNum;
    }

    @Basic
    @Column(name = "checkcarnum_indate")
    public Integer getCheckcarnumIndate() {
        return checkcarnumIndate;
    }

    public void setCheckcarnumIndate(Integer checkcarnumIndate) {
        this.checkcarnumIndate = checkcarnumIndate;
    }

    @Basic
    @Column(name = "retransfer_photo_indate")
    public Integer getRetransferPhotoIndate() {
        return retransferPhotoIndate;
    }

    public void setRetransferPhotoIndate(Integer retransferPhotoIndate) {
        this.retransferPhotoIndate = retransferPhotoIndate;
    }

    @Basic
    @Column(name = "plan_num")
    public Integer getPlanNum() {
        return planNum;
    }

    public void setPlanNum(Integer planNum) {
        this.planNum = planNum;
    }

    @Basic
    @Column(name = "check_plan_time")
    public Integer getCheckPlanTime() {
        return checkPlanTime;
    }

    public void setCheckPlanTime(Integer checkPlanTime) {
        this.checkPlanTime = checkPlanTime;
    }

    @Basic
    @Column(name = "checkcarnum_rule")
    public String getCheckcarnumRule() {
        return checkcarnumRule;
    }

    public void setCheckcarnumRule(String checkcarnumRule) {
        this.checkcarnumRule = checkcarnumRule;
    }

    @Basic
    @Column(name = "submit_num")
    public Integer getSubmitNum() {
        return submitNum;
    }

    public void setSubmitNum(Integer submitNum) {
        this.submitNum = submitNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfigurationEntity that = (ConfigurationEntity) o;
        return id == that.id &&
                rephotoNum == that.rephotoNum &&
                Objects.equals(globalityTime, that.globalityTime) &&
                Objects.equals(rephotoTime, that.rephotoTime) &&
                Objects.equals(scratchTime, that.scratchTime) &&
                Objects.equals(glassTime, that.glassTime) &&
                Objects.equals(notRepairTime, that.notRepairTime) &&
                Objects.equals(addDeviceTime, that.addDeviceTime) &&
                Objects.equals(retransferPhotoTime, that.retransferPhotoTime) &&
                Objects.equals(globalityNum, that.globalityNum) &&
                Objects.equals(scratchNum, that.scratchNum) &&
                Objects.equals(glassNum, that.glassNum) &&
                Objects.equals(notRepairNum, that.notRepairNum) &&
                Objects.equals(addDeviceNum, that.addDeviceNum) &&
                Objects.equals(retransferPhotoNum, that.retransferPhotoNum) &&
                Objects.equals(checkcarnumIndate, that.checkcarnumIndate) &&
                Objects.equals(retransferPhotoIndate, that.retransferPhotoIndate) &&
                Objects.equals(planNum, that.planNum) &&
                Objects.equals(checkPlanTime, that.checkPlanTime) &&
                Objects.equals(checkcarnumRule, that.checkcarnumRule) &&
                Objects.equals(submitNum, that.submitNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, globalityTime, rephotoTime, scratchTime, glassTime, notRepairTime, addDeviceTime, retransferPhotoTime, globalityNum, rephotoNum, scratchNum, glassNum, notRepairNum, addDeviceNum, retransferPhotoNum, checkcarnumIndate, retransferPhotoIndate, planNum, checkPlanTime, checkcarnumRule, submitNum);
    }
}
