package monsterboken.db.model;

import monsterboken.core.model.Mappable;

public interface EntityObject<T> extends Mappable<T> {

    Long getId();
    
}
