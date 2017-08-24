package com.gome.iuv.cloud.service;


import com.gome.iuv.cloud.domain.request.AccountReqDTO;

/**
 * Created by wanghaisheng on 2017/4/12.
 */
public interface AccountInfoService {
    //注册
    String add(AccountReqDTO accountReqDTO);
    //登录
    String login(AccountReqDTO accountReqDTO);
    //完善个人信息
    String modifyAccount(AccountReqDTO accountReqDTO);
    //校验参数
    String verifyParam(AccountReqDTO accountReqDTO);
    //发送短信
    String sendSmsMsg(AccountReqDTO accountReqDTO);
    //发送邮件
    String sendMailMsg(AccountReqDTO accountReqDTO);
    //校验邮件验证码
    String verifyMailMsg(AccountReqDTO accountReqDTO);
    //检验短信验证码
    String verifySmsMsg(AccountReqDTO accountReqDTO);
    //修改密码
    String modifyPwd(AccountReqDTO accountReqDTO);
    //找回密码
    String findPwd(AccountReqDTO accountReqDTO);
    //注销
    String logout(AccountReqDTO accountReqDTO);
    //获取邮箱信息
    String getMailAddress(AccountReqDTO accountReqDTO);
    //修改头像
    String modifyAvatar(AccountReqDTO accountReqDTO);
    //绑定手机号/邮箱
    String bind(AccountReqDTO accountReqDTO);
    //绑定手机号/邮箱
    String unbind(AccountReqDTO accountReqDTO);
}
