package com.fh.dao;

import com.fh.entity.TB_WXQYAPP;
import com.fh.entity.TB_WXQYAPPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TB_WXQYAPPMapper {
    long countByExample(TB_WXQYAPPExample example);

    int deleteByExample(TB_WXQYAPPExample example);

    int deleteByPrimaryKey(String wxqyappId);

    int insert(TB_WXQYAPP record);

    int insertSelective(TB_WXQYAPP record);

    List<TB_WXQYAPP> selectByExample(TB_WXQYAPPExample example);

    TB_WXQYAPP selectByPrimaryKey(String wxqyappId);

    int updateByExampleSelective(@Param("record") TB_WXQYAPP record, @Param("example") TB_WXQYAPPExample example);

    int updateByExample(@Param("record") TB_WXQYAPP record, @Param("example") TB_WXQYAPPExample example);

    int updateByPrimaryKeySelective(TB_WXQYAPP record);

    int updateByPrimaryKey(TB_WXQYAPP record);
}