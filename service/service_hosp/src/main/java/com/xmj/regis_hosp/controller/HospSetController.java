package com.xmj.regis_hosp.controller;

import com.xmj.regis_hosp.service.HospSetService;
import com.xmj.registration.model.hosp.HospitalSet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "医院设置管理")
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospSetController {
    @Autowired
    private HospSetService hospSetService;

    @ApiOperation(value="获取所有医院设置")
    @GetMapping("findAll")
    public List findAllHospitalSet(){
        List<HospitalSet> list=hospSetService.list();
        return list;
    }

    @ApiOperation(value = "逻辑删除医院设置")
    @DeleteMapping("{id}")
    public Boolean removeHospSet(@PathVariable Long id) {
        boolean flag = hospSetService.removeById(id);
        return flag;
    }

}
