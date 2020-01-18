package com.fh.controller;

import com.fh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("emp")
@CrossOrigin
public class EmpController {
    @Autowired
    private EmpService empService;
}
