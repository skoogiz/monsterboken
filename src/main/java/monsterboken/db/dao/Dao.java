package monsterboken.db.dao;

import java.util.Optional;

public interface Dao<T> {

    void create(T bean);

    // Optional<T> find(Long id);

    void update(T bean);

    void delete(T bean);

}
