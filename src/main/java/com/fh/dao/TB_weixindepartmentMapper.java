package com.fh.dao;

import com.fh.entity.TB_weixindepartment;
import com.fh.entity.TB_weixindepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TB_weixindepartmentMapper {
    long countByExample(TB_weixindepartmentExample example);

    int deleteByExample(TB_weixindepartmentExample example);

    int insert(TB_weixindepartment record);

    int insertSelective(TB_weixindepartment record);

    List<TB_weixindepartment> selectByExample(TB_weixindepartmentExample example);

    int updateByExampleSelective(@Param("record") TB_weixindepartment record, @Param("example") TB_weixindepartmentExample example);

    int updateByExample(@Param("record") TB_weixindepartment record, @Param("example") TB_weixindepartmentExample example);
}