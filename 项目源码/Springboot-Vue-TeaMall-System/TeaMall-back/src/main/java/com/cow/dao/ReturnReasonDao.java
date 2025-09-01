package com.cow.dao;

import com.cow.entity.ReturnReason;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @email QQ550080747
 * @date 2020/11/24 20:57
 * @description 退货原因
 */
public interface ReturnReasonDao extends BaseDao<ReturnReason> {
    /**
     * 查询所有退货原因
     *
     * @return 退货原因
     */
    List<String> selectAllName();

    /**
     * 查询退货原因名称是否存在
     *
     * @param reasonId   退货原因编号
     * @param reasonName 退园原因
     * @return 是否存在
     */
    Boolean existsWithReasonName(@Param("reasonId") Integer reasonId, @Param("reasonName") String reasonName);
}
