package org.zongf.learn.jdbc.orm.service.impl;

import org.zongf.learn.jdbc.orm.anno.EnableTranscation;
import org.zongf.learn.jdbc.orm.dao.PersonDao;
import org.zongf.learn.jdbc.orm.po.PersonPO;
import org.zongf.learn.jdbc.orm.service.api.IPersonService;

import java.util.List;

/**
 * @since 1.0
 * @author zongf
 * @created 2019-07-18
 */
public class PersonService implements IPersonService {

    private PersonDao personDao = new PersonDao();

    @EnableTranscation(openNewTx = false)
    @Override
    public boolean save(PersonPO personPO) {
        return this.personDao.save(personPO);
    }

    @Override
    public List<PersonPO> queryAll() {
        return this.personDao.queryAll();
    }
}
