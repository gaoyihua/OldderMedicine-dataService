package com.company.project.service.impl;

import com.company.project.dao.MedicineMapper;
import com.company.project.model.Medicine;
import com.company.project.service.MedicineService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/19.
 */
@Service
@Transactional
public class MedicineServiceImpl extends AbstractService<Medicine> implements MedicineService {
    @Resource
    private MedicineMapper medicineMapper;

}
