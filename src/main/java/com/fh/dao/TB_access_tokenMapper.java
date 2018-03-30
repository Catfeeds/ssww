package com.fh.dao;

import com.fh.entity.TB_access_token;
import com.fh.entity.TB_access_tokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TB_access_tokenMapper {
    long countByExample(TB_access_tokenExample example);

    int deleteByExample(TB_access_tokenExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(TB_access_token record);

    int insertSelective(TB_access_token record);

    List<TB_access_token> selectByExample(TB_access_tokenExample example);

    TB_access_token selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") TB_access_token record, @Param("example") TB_access_tokenExample example);

    int updateByExample(@Param("record") TB_access_token record, @Param("example") TB_access_tokenExample example);

    int updateByPrimaryKeySelective(TB_access_token record);

    int updateByPrimaryKey(TB_access_token record);
}