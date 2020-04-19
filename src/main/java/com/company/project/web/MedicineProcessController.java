package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.MedicineProcess;
import com.company.project.service.MedicineProcessService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/19.
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
        //PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(list);
    }
}
