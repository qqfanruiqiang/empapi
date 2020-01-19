package com.fh.dao;

import com.fh.model.Bean;
import com.fh.model.Emp;

import java.util.List;

public interface EmpDao {
    int queryCount();

    List<Emp> queryEmp(Bean<Emp> bean);
}
