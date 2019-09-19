package com.imooc.demo.service;

import com.imooc.demo.entity.TbArea;

import java.util.List;

public interface AreaService {

        /**
         * 获取区域列表
         *
         * @return
         */
        List<TbArea> getAreaList();

        /**
         * 通过区域Id获取区域信息
         *
         * @param areaId
         * @return
         */
        TbArea getAreaById(int areaId);

        /**
         * 增加区域信息
         *
         * @param area
         * @return
         */
        boolean addArea(TbArea area);

        /**
         * 修改区域信息
         *
         * @param area
         * @return
         */
        boolean modifyArea(TbArea area);

        /**
         * 删除区域信息
         *
         * @param areaId
         * @return
         */
        boolean deleteArea(int areaId);

    }
