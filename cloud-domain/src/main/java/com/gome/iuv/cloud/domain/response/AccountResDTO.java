package com.gome.iuv.cloud.domain.response;

import java.io.Serializable;

/**
 * Created by wangpk on 2017/6/7.
 */
public class AccountResDTO implements Serializable {

    private static final long serialVersionUID = 8381847028129654884L;
    private String nickName;
    //base64 验证
    private String avatarPath;
    private String authCode;
    private String sex;
    private String birthday;
    private String userArea;
    private String safePhoneNo;
    private String token;
    private String phoneNo;
    private String mallAddress;

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
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

    @Override
    public String toString() {
        return "AccountResDTO{" +
                "nickName='" + nickName + '\'' +
                ", avatarPath='" + avatarPath + '\'' +
                ", authCode='" + authCode + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", userArea='" + userArea + '\'' +
                ", safePhoneNo='" + safePhoneNo + '\'' +
                ", token='" + token + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", mallAddress='" + mallAddress + '\'' +
                '}';
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea;
    }

    public String getSafePhoneNo() {
        return safePhoneNo;
    }

    public void setSafePhoneNo(String safePhoneNo) {
        this.safePhoneNo = safePhoneNo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
