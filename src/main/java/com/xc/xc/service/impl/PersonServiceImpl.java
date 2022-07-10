package com.xc.xc.service.impl;

import com.xc.xc.mapper.PersonMapper;
import com.xc.xc.pojo.Person;
import com.xc.xc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper pm;

    @Override
    public List<Person> showAll() {
        return pm.showAll();
    }

    @Override
    public boolean insertPerson(Person ps) {
        return pm.insertPerson(ps)>0;
    }

    @Override
    public boolean deletePerson(Integer id) {
        return pm.deletePerson(id)>0;
    }

    @Override
    public Boolean updatePersom(Person person) {
        return pm.updatePersom(person)>0;
    }

    @Override
    public Person selectByid(Integer id) {
        return pm.selectByid(id);
    }
}
