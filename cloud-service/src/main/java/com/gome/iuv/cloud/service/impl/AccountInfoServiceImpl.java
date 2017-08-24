package com.gome.iuv.cloud.service.impl;

import com.gome.iuv.cloud.dao.entity.AccountInfoEntity;
import com.gome.iuv.cloud.dao.mapper.AccountInfoMapper;
import com.gome.iuv.cloud.domain.request.AccountReqDTO;
import com.gome.iuv.cloud.service.AccountInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.misc.BASE64Decoder;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by wanghaisheng on 2017/5/4.
 */
@Service
public class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    AccountInfoMapper accountInfoMapper;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String add(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String login(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String modifyAccount(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String verifyParam(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String sendSmsMsg(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String sendMailMsg(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String verifyMailMsg(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String verifySmsMsg(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String modifyPwd(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String findPwd(AccountReqDTO accountReqDTO) {
        AccountInfoEntity accountInfoEntity = new AccountInfoEntity();
        accountInfoEntity.setPhoneNo(accountReqDTO.getPhoneNo());
        AccountInfoEntity accountInfoEntity1 = accountInfoMapper.selectAccount(accountInfoEntity);
        return accountInfoEntity1.getNickName();
    }

    @Override
    public String logout(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String getMailAddress(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String modifyAvatar(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String bind(AccountReqDTO accountReqDTO) {
        return null;
    }

    @Override
    public String unbind(AccountReqDTO accountReqDTO) {
        return null;
    }
}
