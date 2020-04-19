package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Medicine;
import com.company.project.service.MedicineService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/19.
*/
@RestController
@RequestMapping("/medicine")
public class MedicineController {
    @Resource
    private MedicineService medicineService;

    @PostMapping("/add")
    public Result add(@RequestBody Medicine medicine) {
        medicineService.save(medicine);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        medicineService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/deleteByNum")
    public Result deleteByNum(@RequestBody Medicine medicine) {
        Medicine old = medicineService.findBy("num", medicine.getNum());
        medicineService.deleteById(old.getId());
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Medicine medicine) {
        medicineService.update(medicine);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/updateByNum")
    public Result updateByNum(@RequestBody Medicine medicine) {
        Medicine old = medicineService.findBy("num", medicine.getNum());
        medicine.setId(old.getId());
        medicineService.update(medicine);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/updateNumByNum")
    public Result updateNumByNum(@RequestBody Medicine medicine) {
        Medicine old = medicineService.findBy("num", medicine.getNum());
        old.setNum(old.getNum() - 1);
        medicineService.update(old);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/findByNum")
    public Result findByNum(@RequestBody Medicine medicine) {
        Medicine old = medicineService.findBy("num", medicine.getNum());
        return ResultGenerator.genSuccessResult(old);
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Medicine medicine = medicineService.findById(id);
        return ResultGenerator.genSuccessResult(medicine);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        //PageHelper.startPage(page, size);
        List<Medicine> list = medicineService.findAll();
        //PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(list);
    }
}
