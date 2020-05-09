package com.company.project.service.impl;

import com.company.project.dao.MedicineProcessMapper;
import com.company.project.model.MedicineProcess;
import com.company.project.service.MedicineProcessService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/24.
 */
@Service
@Transactional
public class MedicineProcessServiceImpl extends AbstractService<MedicineProcess> implements MedicineProcessService {
    @Resource
    private MedicineProcessMapper medicineProcessMapper;

}
