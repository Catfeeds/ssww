package com.fh.dao;

import com.fh.entity.Test1;
import com.fh.entity.Test1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Test1Mapper {
    long countByExample(Test1Example example);

    int deleteByExample(Test1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Test1 record);

    int insertSelective(Test1 record);

    List<Test1> selectByExample(Test1Example example);

    Test1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Test1 record, @Param("example") Test1Example example);

    int updateByExample(@Param("record") Test1 record, @Param("example") Test1Example example);

    int updateByPrimaryKeySelective(Test1 record);

    int updateByPrimaryKey(Test1 record);
}