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
 * @date 2020/11/24 20:54
 * @description 退货原因表
 */
@Data
@Entity
@Table(name = "return_reason")
@NoArgsConstructor
@AllArgsConstructor
public class ReturnReason {
    @Id
    private Integer reasonId;
    private String reasonName;
    private Boolean status;
}
