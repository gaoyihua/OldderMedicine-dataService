package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.OmUser;
import com.company.project.service.OmUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/19.
*/
@RestController
@RequestMapping("/om/user")
public class OmUserController {
    @Resource
    private OmUserService omUserService;

    /**
     *  登陆
     * @param user
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login (@RequestBody OmUser user) {
        System.out.println(user.toString());
        Condition condition = new Condition(OmUser.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.andEqualTo("phone", user.getPhone());
        criteria.andEqualTo("password", user.getPassword());

        List<OmUser> list = omUserService.findByCondition(condition);
        if (list == null || list.size() == 0) {
            return ResultGenerator.genFailResult("密码错误");
        }
        return ResultGenerator.genSuccessResult(list.get(0));
    }

    /**
     * 注册
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Result register (@RequestBody OmUser user) {
        omUserService.save(user);
        return ResultGenerator.genSuccessResult();
    }

//    /**
//     * 修改
//     * @param user
//     */
//    @RequestMapping(value="/{id}",method= RequestMethod.POST)
//    public Result update (@RequestBody OmUser user, @PathVariable int id){
//        user.setId(id);
//        omUserService.update(user);
//        return ResultGenerator.genSuccessResult();
//    }

    @PostMapping("/add")
    public Result add(@RequestBody OmUser omUser) {
        omUserService.save(omUser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        omUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody OmUser omUser) {
        omUserService.update(omUser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        OmUser omUser = omUserService.findById(id);
        return ResultGenerator.genSuccessResult(omUser);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        //PageHelper.startPage(page, size);
        List<OmUser> list = omUserService.findAll();
        //PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(list);
    }
}
