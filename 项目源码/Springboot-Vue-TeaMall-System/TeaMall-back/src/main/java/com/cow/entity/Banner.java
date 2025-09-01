package com.cow.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @email QQ550080747
 * @date 2020/12/31 15:58
 * @description 商品轮播图表
 */
@Data
@Entity
@Table(name = "banner")
@NoArgsConstructor
@AllArgsConstructor
public class Banner {
    @Id
    private Integer bannerId;
    private String productName;
    private String productUrl;
    private String bannerUrl;
}
