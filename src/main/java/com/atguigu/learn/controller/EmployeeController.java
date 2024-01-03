package com.atguigu.learn.controller;

import com.atguigu.learn.pojo.Employee;
import com.atguigu.learn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        List<Employee> list = employeeService.getAllEmployee();
        model.addAttribute("list",list);
        System.out.println("testGit!");
        System.out.println("this modify is by hot-fix");
        System.out.println("push commit");
        System.out.println("pull commit");
        System.out.println("test 本地库");
        return "employee_list";
    }


}
