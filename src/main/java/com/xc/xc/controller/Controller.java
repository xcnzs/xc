package com.xc.xc.controller;


import com.xc.xc.pojo.Person;
import com.xc.xc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private PersonService ps;


    @PostMapping("/showAll")
    @ResponseBody
    public List<Person> showAll() {
        System.out.println(("进来了"));
        return ps.showAll();
    }

    @PostMapping("/del")
    @ResponseBody
    public boolean deleteEmp(Integer id) {
        System.out.println("删除编号：" + id);
        boolean pan = ps.deletePerson(id);
        System.out.println("pan:" + pan);
        return pan;
    }

    //添加
    @RequestMapping("/add")
    @ResponseBody
    public String add(Person person) {
        String jg = "";
        if (ps.insertPerson(person)) {
            jg = "添加成功";
        } else {
            jg = "添加失败";
        }
        return jg;
    }

    //修改
    @RequestMapping("/update")
    @ResponseBody
    public String update(Person person) {
        return null;
    }

    //根据id查询信息
    @RequestMapping("/queryMess")
    @ResponseBody
    public Map<String, Object> queryMess(Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();
        Person person = ps.selectByid(id);//接收查询信息
        map.put("person", person);
        map.put("messa", "修改");

        return map;


    }
}
