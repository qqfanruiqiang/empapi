package com.fh.controller;

import com.fh.model.*;
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
    @RequestMapping("queryJob")
    @ResponseBody
    public List<Job> queryJob(){
        List<Job> list= empService.queryJob();
        return list;
    }
    @RequestMapping("queryLeader")
    @ResponseBody
    public List<Leader> queryLeader(){
        List<Leader> list= empService.queryLeader();
        return list;
    }
    @RequestMapping("queryDept")
    @ResponseBody
    public List<Dept> queryDept(){
        List<Dept> list= empService.queryDept();
        return list;
    }
    @RequestMapping("addEmp")
    @ResponseBody
    public void addEmp(Emp emp){
        empService.addEmp(emp);
    }
    @RequestMapping("queryEmpById")
    @ResponseBody
    public Emp queryEmpById(int id){
        Emp emp=  empService.queryEmpById(id);
        return emp;
    }
    @RequestMapping("updateEmp")
    @ResponseBody
    public void updateEmp(Emp emp){
        empService.updateEmp(emp);
    }
    @RequestMapping("shanchu")
    @ResponseBody
    public void shanchu(int id){
        empService.shanchu(id);
    }
}
