package com.fh.service.impl;

import com.fh.dao.EmpDao;
import com.fh.model.*;
import com.fh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public void queryEmp(Bean<Emp> bean) {
        int count=empDao.queryCount();
        bean.setRecordsTotal(count);
        bean.setRecordsFiltered(count);
        List<Emp> list=empDao.queryEmp(bean);
        bean.setData(list);
    }

    @Override
    public List<Job> queryJob() {
        return empDao.queryJob();
    }

    @Override
    public List<Leader> queryLeader() {
        return empDao.queryLeader();
    }

    @Override
    public List<Dept> queryDept() {
        return empDao.queryDept();
    }

    @Override
    public void addEmp(Emp emp) {
        empDao.addEmp(emp);
    }

    @Override
    public Emp queryEmpById(int id) {
        return empDao.queryEmpById(id);
    }

    @Override
    public void updateEmp(Emp emp) {
        empDao.updateEmp(emp);
    }
}
