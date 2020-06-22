package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.MedicineProcess;
import com.company.project.service.MedicineProcessService;
import com.company.project.util.ExcelUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/24.
*/
@RestController
@RequestMapping("/medicine/process")
public class MedicineProcessController {
    @Resource
    private MedicineProcessService medicineProcessService;

    @PostMapping("/add")
    public Result add(@RequestBody MedicineProcess medicineProcess) {
        medicineProcessService.save(medicineProcess);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        medicineProcessService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody MedicineProcess medicineProcess) {
        medicineProcessService.update(medicineProcess);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        MedicineProcess medicineProcess = medicineProcessService.findById(id);
        return ResultGenerator.genSuccessResult(medicineProcess);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        //PageHelper.startPage(page, size);
        List<MedicineProcess> list = medicineProcessService.findAll();
        Collections.sort(list);
        //PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(list);
    }

    @PostMapping("findByIsFinish")
    public Result findByIsFinish(@RequestBody MedicineProcess medicineProcess) {
        boolean isFinish = medicineProcess.isIsFinish();
        Condition condition = new Condition(MedicineProcess.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.andEqualTo("isFinish", isFinish);
        List<MedicineProcess> list = medicineProcessService.findByCondition(condition);
        Collections.sort(list);
        return ResultGenerator.genSuccessResult(list);
    }

    @PostMapping("/export")
    public void  export(HttpServletResponse response) {
//        response.setHeader("content-type", "application/octet-stream");
//        response.setContentType("application/octet-stream");
//        response.setHeader("Content-Disposition", "attachment; filename=" + "1.xlsx");
//        List<MedicineProcess> list = medicineProcessService.findAll();
//        String [] title = new String[]{"城市","项目名字","合同","实际"};
//        byte[] tests = ExcelUtil.export("1", title, list);
//        try {
//            OutputStream fileOutputStream = response.getOutputStream();
//            fileOutputStream.write(tests);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
