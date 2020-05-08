package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Record;
import com.company.project.service.RecordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/19.
*/
@RestController
@RequestMapping("/record")
public class RecordController {
    @Resource
    private RecordService recordService;

    @PostMapping("/add")
    public Result add(@RequestBody Record record) {
        recordService.save(record);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        recordService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/deleteByNum")
    public Result deleteByNum(@RequestBody Record record) {
        Record old = recordService.findBy("num", record.getNum());
        recordService.deleteById(old.getId());
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Record record) {
        recordService.update(record);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/updateByNum")
    public Result updateByNum(@RequestBody Record record) {
        Record old = recordService.findBy("num", record.getNum());
        record.setId(old.getId());
        recordService.update(record);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/updateNumByNum")
    public Result updateNumByNum(@RequestBody Record record) {
        Record old = recordService.findBy("num", record.getNum());
        old.setNum(old.getNum() - 1);
        recordService.update(old);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/findByNum")
    public Result findByNum(@RequestBody Record record) {
        Record old = recordService.findBy("num", record.getNum());
        return ResultGenerator.genSuccessResult(old);
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Record record = recordService.findById(id);
        return ResultGenerator.genSuccessResult(record);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        //PageHelper.startPage(page, size);
        List<Record> list = recordService.findAll();
        //PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(list);
    }
}
