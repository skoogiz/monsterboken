package monsterboken.db.dao;

import java.util.Optional;

import monsterboken.db.model.EntityObject;

public interface Dao<T extends EntityObject> {

    void create(T bean);

    Optional<T> find(Long id);

    void update(T bean);

    void delete(T bean);

}
