package com.cow.service.impl;

import com.cow.dao.ProductDao;
import com.cow.entity.Product;
import com.cow.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @email QQ550080747
 * @date 2020/11/13 14:55
 * @description 商品信息业务逻辑
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product selectById(Integer productId) {
        return productDao.selectById(productId);
    }

    @Override
    public Product selectByKey(String productNo) {
        return productDao.selectByKey(productNo);
    }

    @Override
    public Integer selectIdByKey(String productNo) {
        return productDao.selectIdByKey(productNo);
    }

    @Override
    public Integer selectCount() {
        return productDao.selectCount();
    }

    @Override
    public Boolean existsWithPrimaryKey(String productNo) {
        return productDao.existsWithPrimaryKey(productNo);
    }

    @Override
    public Boolean existsProductType(String productType) {
        return productDao.existsProductType(productType);
    }

    @Override
    public Boolean existsProductBrand(String productBrand) {
        return productDao.existsProductBrand(productBrand);
    }

    @Override
    public List<Product> selectAll() {
        return productDao.selectAll();
    }

    @Override
    public List<Product> selectAllSale() {
        return productDao.selectAllSale();
    }

    @Override
    public List<Map<String, Object>> selectAllByType() {
        return productDao.selectAllByType();
    }

    @Override
    public Boolean insertData(Product product) {
        product.setSaleTime(new Date());
        return productDao.insertData(product);
    }

    @Override
    public Boolean updateById(Product product) {
        return productDao.updateById(product);
    }

    @Override
    public Boolean deleteById(Integer productId) {
        return productDao.deleteById(productId);
    }

    @Override
    public List<Product> selectAllLikeName(String keyWord) {
        return productDao.selectAllLikeName(keyWord);
    }

    @Override
    public List<Product> selectAllLikeType(String keyWord) {
        return productDao.selectAllLikeType(keyWord);
    }

    @Override
    public List<Product> selectAllLikeBrand(String keyWord) {
        return productDao.selectAllLikeBrand(keyWord);
    }

    @Override
    public Map<String, Object> productOverview() {
        return productDao.productOverview();
    }
}
