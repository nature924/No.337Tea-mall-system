package com.cow.service.impl;

import com.cow.dao.ProductTypeDao;
import com.cow.entity.ProductType;
import com.cow.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @email QQ550080747
 * @date 2020/11/12 15:46
 * @description 商品分类业务逻辑
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    private ProductTypeDao productTypeDao;

    @Override
    public ProductType selectById(Integer typeId) {
        return productTypeDao.selectById(typeId);
    }

    @Override
    public List<ProductType> selectAll() {
        return productTypeDao.selectAll();
    }

    @Override
    public Boolean existsWithTypeName(Integer typeId, String typeName) {
        return productTypeDao.existsWithTypeName(typeId, typeName);
    }


    @Override
    public List<String> selectAllName() {
        return productTypeDao.selectAllName();
    }

    @Override
    public Boolean insertData(ProductType productType) {
        return productTypeDao.insertData(productType);
    }

    @Override
    public Boolean updateById(ProductType productType) {
        return productTypeDao.updateById(productType);
    }

    @Override
    public Boolean deleteById(Integer typeId) {
        return productTypeDao.deleteById(typeId);
    }

    @Override
    public Boolean deleteByName(String typeName) {
        return productTypeDao.deleteByName(typeName);
    }
}
