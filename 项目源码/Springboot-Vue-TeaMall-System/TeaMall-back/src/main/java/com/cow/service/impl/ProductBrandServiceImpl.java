package com.cow.service.impl;

import com.cow.dao.ProductBrandDao;
import com.cow.entity.ProductBrand;
import com.cow.service.ProductBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @email QQ550080747
 * @date 2020/11/12 17:02
 * @description 商品品牌业务逻辑
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ProductBrandServiceImpl implements ProductBrandService {
    @Autowired
    private ProductBrandDao productBrandDao;

    @Override
    public ProductBrand selectById(Integer brandId) {
        return productBrandDao.selectById(brandId);
    }

    @Override
    public List<ProductBrand> selectAll() {
        return productBrandDao.selectAll();
    }


    @Override
    public List<String> selectAllName() {
        return productBrandDao.selectAllName();
    }

    @Override
    public Boolean existsWithBrandName(Integer brandId, String brandName) {
        return productBrandDao.existsWithBrandName(brandId, brandName);
    }

    @Override
    public Boolean insertData(ProductBrand productBrand) {
        return productBrandDao.insertData(productBrand);
    }

    @Override
    public Boolean updateById(ProductBrand productBrand) {
        return productBrandDao.updateById(productBrand);
    }

    @Override
    public Boolean deleteById(Integer brandId) {
        return productBrandDao.deleteById(brandId);
    }

    @Override
    public Boolean deleteByName(String brandName) {
        return productBrandDao.deleteByName(brandName);
    }
}
