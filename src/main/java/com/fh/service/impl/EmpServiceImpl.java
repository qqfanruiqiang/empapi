package com.fh.service.impl;

import com.fh.dao.EmpDao;
import com.fh.model.Bean;
import com.fh.model.Emp;
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
}
