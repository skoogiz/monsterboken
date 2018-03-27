package monsterboken.db.dao;

import java.util.Optional;

import monsterboken.db.model.EntityObject;

public interface Dao<M, T extends EntityObject<M>> {

    void create(T bean);

    Optional<M> find(Long id);

    void update(T bean);

    void delete(T bean);

}
