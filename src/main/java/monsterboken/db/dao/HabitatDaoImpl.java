package monsterboken.db.dao;

import monsterboken.core.model.Habitat;
import monsterboken.db.model.HabitatEO;

public class HabitatDaoImpl extends AbstractDao<Habitat, HabitatEO> implements HabitatDao {

    public HabitatDaoImpl() {
        super(HabitatEO.class);
    }

}
