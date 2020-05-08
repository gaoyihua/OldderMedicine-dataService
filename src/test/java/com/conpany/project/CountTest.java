package com.conpany.project;

import com.company.project.dao.OmUserMapper;
import com.company.project.model.CountModel;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * describe:
 *
 * @author
 * @date 2020/04/28
 */
public class CountTest extends Tester {
    @Autowired
    private OmUserMapper omUserMapper;

    @Test
    public void test() {
        List<Integer> list = omUserMapper.fun();
        System.out.println(list.size());
    }
}
