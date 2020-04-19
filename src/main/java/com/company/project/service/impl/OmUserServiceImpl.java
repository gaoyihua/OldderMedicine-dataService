package com.company.project.service.impl;

import com.company.project.dao.OmUserMapper;
import com.company.project.model.OmUser;
import com.company.project.service.OmUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/19.
 */
@Service
@Transactional
public class OmUserServiceImpl extends AbstractService<OmUser> implements OmUserService {
    @Resource
    private OmUserMapper omUserMappe;
}
