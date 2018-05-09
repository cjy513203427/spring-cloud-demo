package cn.demo.service0.controller;

import cn.demo.service0.entity.Area;
import cn.demo.service0.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2018/3/29.
 */
@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    private Map<String,Object> listArea(){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        List<Area> list = areaService.getAreaList();
        modelMap.put("areaList",list);
        return modelMap;
    }

    @RequestMapping(value = "/getareabyid",method = RequestMethod.GET)
    private Map<String,Object> getAreaById(Integer areaId){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        Area area = areaService.getAreaById(areaId);
        modelMap.put("area",area);
        return modelMap;
    }

    @RequestMapping(value = "/addarea",method = RequestMethod.POST)
    private Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        boolean effectedNum = areaService.addArea(area);
        modelMap.put("Success",effectedNum);
        return modelMap;
    }

    @RequestMapping(value = "/modifyarea",method = RequestMethod.POST)
    private Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        boolean effectedNum = areaService.modifyArea(area);
        modelMap.put("Success",effectedNum);
        return modelMap;
    }

    @RequestMapping(value = "/removearea",method = RequestMethod.GET)
    private Map<String,Object> removeArea(Integer areaId){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        boolean effectedNum = areaService.deleteArea(areaId);
        modelMap.put("Success",effectedNum);
        return modelMap;
    }
}
