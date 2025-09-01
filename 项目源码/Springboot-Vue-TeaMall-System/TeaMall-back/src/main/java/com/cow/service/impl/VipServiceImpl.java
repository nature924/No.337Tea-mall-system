package com.cow.service.impl;

import com.cow.dao.VipDao;
import com.cow.entity.Vip;
import com.cow.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 *
 * @email QQ550080747
 * @date 2020/11/20 16:49
 * @description 会员业务逻辑
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class VipServiceImpl implements VipService {
    @Autowired
    private VipDao vipDao;

    @Override
    public Vip selectById(Integer vipId) {
        return vipDao.selectById(vipId);
    }

    @Override
    public List<Vip> selectAll() {
        return vipDao.selectAll();
    }

    @Override
    public Boolean existsVip(String accountNumber) {
        return vipDao.existsVip(accountNumber);
    }

    @Override
    public Vip selectByKey(String accountNumber) {
        return vipDao.selectByKey(accountNumber);
    }

    @Override
    public Boolean insertData(Vip vip) {
        vip.setCreatTime(new Date());
        return vipDao.insertData(vip);
    }

    @Override
    public Boolean updateById(Vip vip) {
        return vipDao.updateById(vip);
    }

    @Override
    public Boolean deleteById(Integer vipId) {
        return vipDao.deleteById(vipId);
    }
}
