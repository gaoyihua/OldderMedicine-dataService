package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.CountModel;
import com.company.project.model.OmUser;

import java.util.List;

public interface OmUserMapper extends Mapper<OmUser> {
    List<Integer> fun();
}