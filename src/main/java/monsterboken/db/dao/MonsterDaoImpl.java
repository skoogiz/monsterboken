package monsterboken.db.dao;

import monsterboken.core.model.Monster;
import monsterboken.db.model.MonsterEO;

public class MonsterDaoImpl extends AbstractDao<Monster, MonsterEO> implements MonsterDao {

    public MonsterDaoImpl() {
        super(MonsterEO.class);
    }

}
