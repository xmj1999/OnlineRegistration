package com.xmj.regis_hosp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmj.regis_hosp.mapper.HospSetMapper;
import com.xmj.regis_hosp.service.HospSetService;
import com.xmj.registration.model.hosp.HospitalSet;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HospSetServiceImpl extends ServiceImpl<HospSetMapper,HospitalSet> implements HospSetService {
    @Resource
    private  HospSetMapper hospSetMapper;
}
