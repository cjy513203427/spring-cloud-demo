package cn.demo.service0.service;

import cn.demo.service0.entity.Area;;

import java.util.List;

/**
 * Created by hasee on 2018/3/29.
 */
public interface AreaService {
    /**
     * 列出区域列表
     * @return
     */
    List<Area> getAreaList();

    /**
     * 根据Id列出具体区域
     * @param areaId
     * @return
     */
    Area getAreaById(int areaId);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int areaId);
}
