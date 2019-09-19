package com.imooc.demo.service.impl;

import com.imooc.demo.dao.TbAreaMapper;
import com.imooc.demo.entity.TbArea;
import com.imooc.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private TbAreaMapper tbAreaMapper;

    @Override
    public List<TbArea> getAreaList() {

        List<TbArea> areaList = tbAreaMapper.queryArea();

        return areaList;
    }

    @Override
    public TbArea getAreaById(int areaId) {

        TbArea tbArea = tbAreaMapper.selectByPrimaryKey(areaId);

        return tbArea;
    }

    @Override
    public boolean addArea(TbArea area) {

        if(area.getAreaName() != null && !"".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());

            try{
                int affectedNum = tbAreaMapper.insertSelective(area);
                return affectedNum>0 ? true : false;
            }catch (Exception e){
                throw new RuntimeException("插入失败!" + e.getMessage());
            }
        }else{
            throw new RuntimeException("区域信息不能为空!");
        }

    }

    @Override
    public boolean modifyArea(TbArea area) {

        if(area.getAreaId() != null && area.getAreaId()>0){
            area.setCreateTime(new Date());

            try{
                int affectedNum = tbAreaMapper.updateByPrimaryKeySelective(area);
                return affectedNum>0 ? true : false;
            }catch (Exception e){
                throw new RuntimeException("更新失败!" + e.getMessage());
            }
        }else{
            throw new RuntimeException("区域信息不能为空!");
        }
    }

    @Override
    public boolean deleteArea(int areaId) {

        if(areaId>0){
            try{
                int affectedNum = tbAreaMapper.deleteByPrimaryKey(areaId);
                return affectedNum>0 ? true : false;
            }catch (Exception e){
                throw new RuntimeException("删除失败!" + e.getMessage());
            }
        }else{
            throw new RuntimeException("删除失败!");
        }
    }
}
