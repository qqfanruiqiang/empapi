package com.fh.dao;

import com.fh.model.*;

import java.util.List;

public interface EmpDao {
    int queryCount();

    List<Emp> queryEmp(Bean<Emp> bean);

    List<Job> queryJob();

    List<Leader> queryLeader();

    List<Dept> queryDept();

    void addEmp(Emp emp);

    Emp queryEmpById(int id);

    void updateEmp(Emp emp);

    void shanchu(int id);
}
