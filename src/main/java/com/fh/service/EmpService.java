package com.fh.service;

import com.fh.model.*;

import java.util.List;

public interface EmpService {
    void queryEmp(Bean<Emp> bean);

    List<Job> queryJob();

    List<Leader> queryLeader();

    List<Dept> queryDept();

    void addEmp(Emp emp);
}
