package com.gome.iuv.cloud.dao.mapper;



import com.gome.iuv.cloud.dao.entity.AccountInfoEntity;
import java.util.Date;
import java.util.List;

/**
 * Created by wanghaisheng on 2017/4/12.
 */
public interface AccountInfoMapper {
    void insert(AccountInfoEntity accountInfoEntity);
    int countAccountByPhoneNo(AccountInfoEntity accountInfoEntity);
    int countAccountByMallAddress(AccountInfoEntity accountInfoEntity);
    AccountInfoEntity selectLoginAccount(AccountInfoEntity accountInfoEntity);
    void updatePwd(AccountInfoEntity accountInfoEntity);
    void updateAccountInfo(AccountInfoEntity accountInfoEntity);
    AccountInfoEntity selectAccount(AccountInfoEntity accountInfoEntity);
    List<AccountInfoEntity> selectAccountByMallAddress(String mallAddress);

    List<AccountInfoEntity> selectAccountByActiveTime(Date date);
    void deleteAccoutByIds(List<Long> idList);
    void updateBdList(List<Long> idList);
    void updateUnbdList(List<Long> idList);
}
