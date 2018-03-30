package com.fh.dao2;

import com.fh.entity.T_ICItem;
import com.fh.entity.T_ICItemExample;
import com.fh.util.PageData;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T_ICItemMapper {
    long countByExample(T_ICItemExample example);

    int deleteByExample(T_ICItemExample example);

    int insert(T_ICItem record);

    int insertSelective(T_ICItem record);

    List<T_ICItem> selectByExampleWithBLOBs(T_ICItemExample example);
    
    List<T_ICItem> selectByOther(T_ICItemExample example);

    List<T_ICItem> selectByExample(T_ICItemExample example);

    int updateByExampleSelective(@Param("record") T_ICItem record, @Param("example") T_ICItemExample example);

    int updateByExampleWithBLOBs(@Param("record") T_ICItem record, @Param("example") T_ICItemExample example);

    int updateByExample(@Param("record") T_ICItem record, @Param("example") T_ICItemExample example);
}