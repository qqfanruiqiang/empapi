package com.fh.controller;

import com.fh.model.Bean;
import com.fh.model.Emp;
import com.fh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("emp")
@CrossOrigin
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("queryEmp")
    @ResponseBody
    public Bean<Emp> queryEmp(Bean<Emp> bean){
        empService.queryEmp(bean);
        return bean;
    }
}
