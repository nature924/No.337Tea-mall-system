package com.cow.service.impl;

import com.cow.dao.LogisticsDao;
import com.cow.entity.Logistics;
import com.cow.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @email QQ550080747
 * @date 2020/11/26 17:50
 * @description 物流业务逻辑
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LogisticsServiceImpl implements LogisticsService {
    @Autowired
    private LogisticsDao logisticsDao;

    @Override
    public Logistics selectById(Integer logisticId) {
        return logisticsDao.selectById(logisticId);
    }

    @Override
    public List<Logistics> selectAll() {
        return logisticsDao.selectAll();
    }

    @Override
    public Logistics selectOrderNo(String orderNo) {
        return logisticsDao.selectOrderNo(orderNo);
    }

    @Override
    public Boolean insertData(Logistics logistics) {
        return logisticsDao.insertData(logistics);
    }

    @Override
    public Boolean deleteById(Integer logisticId) {
        return logisticsDao.deleteById(logisticId);
    }
}
