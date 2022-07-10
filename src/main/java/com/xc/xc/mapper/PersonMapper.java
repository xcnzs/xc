package com.xc.xc.mapper;


import com.xc.xc.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PersonMapper {
    //查询所有
     List<Person> showAll();
    //添加
     int insertPerson(Person ps);
    //删除
    int deletePerson(Integer id);
    //修改
    int updatePersom(Person person);
    //根据id查信息
    Person selectByid(Integer id);
}
