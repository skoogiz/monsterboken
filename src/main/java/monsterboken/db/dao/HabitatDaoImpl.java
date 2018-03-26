package monsterboken.db.dao;

import monsterboken.db.model.HabitatEO;

public class HabitatDaoImpl extends AbstractDao<HabitatEO> implements HabitatDao {

    public HabitatDaoImpl() {
        super(HabitatEO.class);
    }

}
