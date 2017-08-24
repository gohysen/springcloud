package com.gome.iuv.cloud.rest;

import com.gome.iuv.cloud.domain.request.AccountReqDTO;
import com.gome.iuv.cloud.domain.response.AccountResDTO;
import com.gome.iuv.cloud.service.AccountInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanghaisheng on 2017/8/2.
 */
@RestController
@RequestMapping("/cloud")
public class CloudBackRest {

    private Logger logger = Logger.getLogger(CloudBackRest.class);

    @Autowired
    AccountInfoService accountInfoService;

    @RequestMapping("/hello")
    public String greeting() {
        logger.info("---------------------------------");
        AccountReqDTO accountReqDTO = new AccountReqDTO();
        accountReqDTO.setPhoneNo("15370467818");
        String back = accountInfoService.findPwd(accountReqDTO);
        return back;
    }
}
