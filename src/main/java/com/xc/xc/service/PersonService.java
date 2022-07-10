package com.xc.xc.service;


import com.xc.xc.pojo.Person;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public interface PersonService {
    //查询所有
    public List<Person> showAll();
    //添加
    public boolean insertPerson(Person ps);
    //删除
    public boolean deletePerson(Integer id);
    //修改
    Boolean updatePersom(Person person);
    //根据id查信息
    Person selectByid(Integer id);
}
