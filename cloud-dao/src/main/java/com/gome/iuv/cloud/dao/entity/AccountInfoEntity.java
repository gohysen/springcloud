package com.gome.iuv.cloud.dao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wanghs
 * on 17/4/11.
 */
public class AccountInfoEntity implements Serializable {

    private static final long serialVersionUID = -4882443420937679198L;
    private Long gomeId;
    private String phoneNo;
    private String mallAddress;
    private String loginPwd;
    private String nickName;
    private String realName;
    private int userLevel;
    private String sex;
    private String avatar;
    private int registerType;
    private String userSign;
    private String userArea;
    private String qrCode;
    private Date birthday;
    private Date createdTime;//创建日期
    private Date modifiedTime;//修改时间
    private String safePhoneNo;
    private String token;
    private String activeStatus;
    private Date activeTime;
    private Date registerTime;

    @Override
    public String toString() {
        return "AccountInfoEntity{" +
                "gomeId=" + gomeId +
                ", phoneNo='" + phoneNo + '\'' +
                ", mallAddress='" + mallAddress + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", nickName='" + nickName + '\'' +
                ", realName='" + realName + '\'' +
                ", userLevel=" + userLevel +
                ", sex='" + sex + '\'' +
                ", avatar='" + avatar + '\'' +
                ", registerType=" + registerType +
                ", userSign='" + userSign + '\'' +
                ", userArea='" + userArea + '\'' +
                ", qrCode='" + qrCode + '\'' +
                ", birthday=" + birthday +
                ", createdTime=" + createdTime +
                ", modifiedTime=" + modifiedTime +
                ", safePhoneNo='" + safePhoneNo + '\'' +
                ", token='" + token + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                ", activeTime=" + activeTime +
                ", registerTime=" + registerTime +
                ", lastLoginTime=" + lastLoginTime +
                '}';
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    private Date lastLoginTime;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSafePhoneNo() {
        return safePhoneNo;
    }

    public void setSafePhoneNo(String safePhoneNo) {
        this.safePhoneNo = safePhoneNo;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMallAddress() {
        return mallAddress;
    }

    public void setMallAddress(String mallAddress) {
        this.mallAddress = mallAddress;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Long getGomeId() {
        return gomeId;
    }

    public void setGomeId(Long gomeId) {
        this.gomeId = gomeId;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getRegisterType() {
        return registerType;
    }

    public void setRegisterType(int registerType) {
        this.registerType = registerType;
    }

    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

}
