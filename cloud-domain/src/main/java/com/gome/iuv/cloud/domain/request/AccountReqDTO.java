package com.gome.iuv.cloud.domain.request;


import com.gome.iuv.cloud.dao.entity.AccountInfoEntity;

import java.io.Serializable;

/**
 * Created by wanghaisheng on 2017/5/5.
 */
public class AccountReqDTO implements Serializable{

    private static final long serialVersionUID = -5671435926392119591L;

    private Long gomeId;
    private String phoneNo;
    private String mallAddress;
    private String loginPwd;
    private String newLoginPwd;
    private String nickName;
    //base64 验证
    private String avatar;
    private String authCode;
    private String avatarType;
    private String sex;
    private String birthday;
    private String userArea;
//    private Integer registerType;
    private String safePhoneNo;
//    private Integer smsVerifyType;//注册/安全号码/找回密码
//    private Integer mailVerifyType;//注册/激活/解绑/找回密码
    private String token;
//    private Integer verifyType;
//    private Integer checkType;
    private int operateType;
    private String thirdId;
    private int thirdType;
    private String userName;

    @Override
    public String toString() {
        return "AccountReqDTO{" +
                "gomeId=" + gomeId +
                ", phoneNo='" + phoneNo + '\'' +
                ", mallAddress='" + mallAddress + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", newLoginPwd='" + newLoginPwd + '\'' +
                ", nickName='" + nickName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", authCode='" + authCode + '\'' +
                ", avatarType='" + avatarType + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", userArea='" + userArea + '\'' +
                ", safePhoneNo='" + safePhoneNo + '\'' +
                ", token='" + token + '\'' +
                ", operateType=" + operateType +
                ", thirdId='" + thirdId + '\'' +
                ", thirdType=" + thirdType +
                ", userName='" + userName + '\'' +
                ", accountInfoEntity=" + accountInfoEntity +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getThirdId() {
        return thirdId;
    }

    public void setThirdId(String thirdId) {
        this.thirdId = thirdId;
    }

    public int getThirdType() {
        return thirdType;
    }

    public void setThirdType(int thirdType) {
        this.thirdType = thirdType;
    }

    private AccountInfoEntity accountInfoEntity;

    public AccountInfoEntity getAccountInfoEntity() {
        return accountInfoEntity;
    }

    public void setAccountInfoEntity(AccountInfoEntity accountInfoEntity) {
        this.accountInfoEntity = accountInfoEntity;
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

    public Long getGomeId() {
        return gomeId;
    }

    public void setGomeId(Long gomeId) {
        this.gomeId = gomeId;
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

    public String getNewLoginPwd() {
        return newLoginPwd;
    }

    public void setNewLoginPwd(String newLoginPwd) {
        this.newLoginPwd = newLoginPwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getAvatarType() {
        return avatarType;
    }

    public void setAvatarType(String avatarType) {
        this.avatarType = avatarType;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getOperateType() {
        return operateType;
    }

    public void setOperateType(int operateType) {
        this.operateType = operateType;
    }
}
