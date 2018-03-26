package monsterboken.db.dao;

import monsterboken.db.model.MonsterEO;

public class MonsterDaoImpl extends AbstractDao<MonsterEO> implements MonsterDao {

    public MonsterDaoImpl() {
        super(MonsterEO.class);
    }

}
