package com.imooc.demo.dao;

import com.imooc.demo.entity.TbArea;
import com.imooc.demo.entity.TbAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAreaMapper {

    long countByExample(TbAreaExample example);

    int deleteByExample(TbAreaExample example);

    int deleteByPrimaryKey(Integer areaId);

    int insert(TbArea record);

    int insertSelective(TbArea record);

    List<TbArea> selectByExample(TbAreaExample example);

    TbArea selectByPrimaryKey(Integer areaId);

    int updateByExampleSelective(@Param("record") TbArea record, @Param("example") TbAreaExample example);

    int updateByExample(@Param("record") TbArea record, @Param("example") TbAreaExample example);

    int updateByPrimaryKeySelective(TbArea record);

    int updateByPrimaryKey(TbArea record);

    List<TbArea> queryArea();

}